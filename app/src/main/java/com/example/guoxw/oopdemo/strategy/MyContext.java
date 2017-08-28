package com.example.guoxw.oopdemo.strategy;

/**
 * Created by guoxw on 2017/8/28 0028.
 *
 * @author guoxw
 * @createTime 2017/8/28 0028 13:55
 * @packageName com.example.guoxw.oopdemo.strategy
 */

public class MyContext {

    private IStrategy strategy;

    public MyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.doSomething();
    }
}
