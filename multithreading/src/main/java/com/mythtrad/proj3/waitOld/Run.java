package com.mythtrad.proj3.waitOld;

/**
 * @Author：Yerik Xiang
 * @Date：2020/9/24 17:35
 * @Desc：
 */

class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}

class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();

    }
}

public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract threadSubtract = new ThreadSubtract(subtract);
        threadSubtract.setName("subtract1Thread");
        threadSubtract.start();
        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("subtract2Thread");
        threadSubtract1.start();
        Thread.sleep(1000);
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }
}
