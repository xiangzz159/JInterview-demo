package com.mydesign.Prototype.demo2;

import java.util.Map;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/24 14:33
 * @Desc：
 */
public class FileConcreatePrototype extends Prototype {
    public FileConcreatePrototype(Integer fileid, String filename, Map<String, Double> scores) {
        super(fileid, filename, scores);
        System.out.println("*********** 我是构造方法 ***********");
    }

    public void show() {
        System.out.println("***** 文件信息 *****");
        System.out.println("文件名：" + this.getFilename());
        System.out.println("文件号：" + this.getFileid());
        System.out.println("文件打分：" + this.getScores());
    }


}
