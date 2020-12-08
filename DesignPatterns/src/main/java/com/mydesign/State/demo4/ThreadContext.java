package com.mydesign.State.demo4;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:50
 * @Desc：
 */
public class ThreadContext {
    private ThreadState state;
    ThreadContext() {
        state = new New();
    }
    public void setState(ThreadState state) {
        this.state = state;
    }
    public ThreadState getState() {
        return state;
    }
    public void start() {
        ((New) state).start(this);
    }
    public void getCPU() {
        ((Runnable) state).getCPU(this);
    }
    public void suspend() {
        ((Running) state).suspend(this);
    }
    public void stop() {
        ((Running) state).stop(this);
    }
    public void resume() {
        ((Blocked) state).resume(this);
    }
}
