package com.xiang;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/10 10:51
 * @Desc：mvn install;mvn com.xiang:xiang-maven-plugin:1.0-SNAPSHOT:hello -Dhello.name="Yerik"
 */
@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

    @Parameter(property = "hello.name")
    private String name;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("hello world");
        getLog().info("Hello " + name);
    }

}
