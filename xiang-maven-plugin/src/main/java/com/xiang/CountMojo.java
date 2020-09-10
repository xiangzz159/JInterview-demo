package com.xiang;

import org.apache.maven.model.Resource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/10 10:51
 * @Desc：mvn install;mvn com.xiang:xiang-maven-plugin:1.0-SNAPSHOT:count
 */
@Mojo(name="count")
public class CountMojo extends AbstractMojo{

    private static final String[] INCLUDES_DEFAULT={"properties","xml","java","yml"};

    @Parameter(defaultValue = "${basedir}")
    private File baseDir;

    @Parameter(defaultValue = "${project.build.resources}",readonly = true,required = true)
    private List<Resource> resources;

    @Parameter(defaultValue = "${project.build.sourceDirectory}",required = true,readonly = true)
    private File sourceDir;

    @Parameter(defaultValue = "${project.build.testResources}",readonly = true,required = true)
    private List<Resource> testResources;

    @Parameter(defaultValue = "${project.build.testSourceDirectory}",readonly = true,required = true)
    private File testSourceDir;

    @Parameter(property ="count.include")
    private String[] includes;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("baseDir目录"+baseDir);
        if(includes.length==0 || includes==null){
            includes = INCLUDES_DEFAULT;
        }

        try {
            countDir(sourceDir);

            countDir(testSourceDir);

            for (Resource resource : resources) {
                countDir(new File(resource.getDirectory()));
            }

            for (Resource testResource : testResources) {
                countDir(new File(testResource.getDirectory()));
            }
        }catch (IOException e){
            throw new MojoExecutionException(e.getMessage());
        }
    }

    private void showInclude() {
        getLog().info("include包括"+ Arrays.asList(includes));
    }

    public void countDir(File file) throws IOException {

        for(String fileType:includes){
            getLog().info(file.getAbsolutePath()
                    .substring(baseDir.getName().length())
                    +"目录："+fileType+"文件共计"+countFile(file,fileType));
            getLog().info(file.getAbsolutePath()
                    .substring(baseDir.getName().length())
                    +"目录"+fileType+"文件代码共计行数："+countLine(file,fileType));
        }


    }

    public int countFile(File file,String fileType){
        int num =0;
        if(file.isFile() && file.getName().endsWith("."+fileType)){
            return num++;
        }

        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f : files){
                if(f.isFile() && f.getName().endsWith("."+fileType)){
                    num++;
                }else{
                    num += countFile(f,fileType);
                }
            }
        }
        return num;
    }

    public int countLine(File file,String fileType) throws IOException {
        int countline=0;

        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                if(f.isFile() && f.getName().endsWith("."+fileType)){
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    while(br.readLine()!=null){
                        countline++;
                    }
                }else{
                    countline+=countLine(f,fileType);
                }
            }
        }
        return countline;
    }
}

