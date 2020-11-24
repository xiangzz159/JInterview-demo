package com.mydesign.prototype.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/24 14:37
 * @Desc：
 */
public class User {
    public static void main(String[] args) throws CloneNotSupportedException {
        String fileName = "fileName";
        int fileId = 1;
        Map<String, Double> fileScore = new HashMap<>();
        fileScore.put("张三", 2.12);

        FileConcreatePrototype fileConcreatePrototype = new FileConcreatePrototype(fileId, fileName, fileScore);
        FileConcreatePrototype fileConcreatePrototype1 = (FileConcreatePrototype) fileConcreatePrototype.clone();
        FileConcreatePrototype fileConcreatePrototype2 = (FileConcreatePrototype) fileConcreatePrototype.clone();
        fileConcreatePrototype2.getScores().put("李四", 99.99);
        fileConcreatePrototype1.show();
        fileConcreatePrototype2.show();

    }
}
