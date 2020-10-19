package com.mythtrad.proj5.timerTask2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/16 17:30
 * @Desc：
 */
public class Run {
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2020-10-16 17:35:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("任务执行时间：" + dateRef.toLocaleString() + " 当前时间为：" + new Date());
            timer.schedule(task, dateRef, 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
