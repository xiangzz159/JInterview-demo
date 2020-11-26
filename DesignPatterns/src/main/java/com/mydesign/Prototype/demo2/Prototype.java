package com.mydesign.Prototype.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/24 14:27
 * @Desc：
 */
public abstract class Prototype implements Cloneable {
    private Integer fileid;
    private String filename;
    private Map<String, Double> scores;

    public Prototype() {
    }

    public Prototype(Integer fileid, String filename, Map<String, Double> scores) {
        this.fileid = fileid;
        this.filename = filename;
        this.scores = scores;
    }

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public void setScores(Map<String, Double> scores) {
        this.scores = scores;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype filePrototype = null;
        try {
            // 基本对象拷贝
            filePrototype = (Prototype) super.clone();
            // 复杂对象拷贝
            filePrototype.scores = (Map<String, Double>)((HashMap)this.scores).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filePrototype;
    }
}
