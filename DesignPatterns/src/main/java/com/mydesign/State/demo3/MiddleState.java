package com.mydesign.State.demo3;

/**
 * @Author：Yerik Xiang
 * @Date：2020/12/8 17:26
 * @Desc：
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }
    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}
