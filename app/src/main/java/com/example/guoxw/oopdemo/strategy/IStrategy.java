package com.example.guoxw.oopdemo.strategy;

/**
 * Created by guoxw on 2017/8/28 0028.
 *
 * @author guoxw
 * @createTime 2017/8/28 0028 13:50
 * @packageName com.example.guoxw.oopdemo.strategy
 */

/**
 * 抽象策略：通常情况下为一个接口，当各个实现类中存在着重复的逻辑时，则使用抽象类来封装这部分公共的代码，此时，策略模式看上去更像是模版方法模式。
 */
public interface IStrategy {

    public void doSomething();

}
