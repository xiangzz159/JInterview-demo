package com.mythtrad.ThreadLocalDemo;

import java.text.SimpleDateFormat;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/2 16:06
 * @Desc：
 */
public class SimpleDate {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");;

    public static SimpleDateFormat getSimpleDateFormat() {
            if (simpleDateFormat == null) {
                synchronized (SimpleDate.class) {
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    }
                }
            }
        return simpleDateFormat;
    }
}
