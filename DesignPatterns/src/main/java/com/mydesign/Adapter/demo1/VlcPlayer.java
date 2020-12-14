package com.mydesign.Adapter.demo1;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/13 12:11
 * @Desc：
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
