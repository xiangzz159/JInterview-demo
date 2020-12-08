package com.mydesign.State.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:24
 * @Desc：
 */
public class ScoreContext {
    private AbstractState state;
    ScoreContext() {
        state = new LowState(this);
    }
    public void setState(AbstractState state) {
        this.state = state;
    }
    public AbstractState getState() {
        return state;
    }
    public void add(int score) {
        state.addScore(score);
    }
}
