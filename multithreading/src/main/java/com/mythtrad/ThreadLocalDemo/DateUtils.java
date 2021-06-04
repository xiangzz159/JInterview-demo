package com.mythtrad.ThreadLocalDemo;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author：Yerik Xiang
 * @Date：2021/6/2 15:35
 * @Desc：
 */
public class DateUtils {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final ThreadLocal<SimpleDateFormat> TIMED_LOCAK = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public static Date parse(String dateStr) {
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
    // 加重了创建对象的负担，会频繁地创建和销毁对象，效率较低。
    public static Date parseNew(String strDate){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.parse(strDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date parseThreadLocal(String dateStr) {
        Date date = null;
        try {
            date = TIMED_LOCAK.get().parse(dateStr);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    // 使用synchronized，非常简单的解决了线程安全的问题，缺陷就是synchronized是重量级的，并发量大的时候对性能有影响。
    public static synchronized Date parseSync(String dateStr) {
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date parseSingle(String dateStr) {
        Date date = null;
        try {
            date = SimpleDate.getSimpleDateFormat().parse(dateStr);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    public static LocalDateTime parseDateTime(String dateNow) {
        return LocalDateTime.parse(dateNow, formatter);
    }
}
