package com.mythtrad.proj5.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/16 09:55
 * @Desc：
 */
public class Run1 {
    private static Timer timer = new Timer();
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
            String dateString = "2020-10-16 10:00:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("任务执行时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date());
            timer.schedule(task, dateRef);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
