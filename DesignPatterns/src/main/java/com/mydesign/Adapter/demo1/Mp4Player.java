package com.mydesign.Adapter.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 12:11
 * @Desc：
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
