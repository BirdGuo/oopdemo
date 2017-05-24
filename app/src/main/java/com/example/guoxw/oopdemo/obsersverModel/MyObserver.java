package com.example.guoxw.oopdemo.obsersverModel;

/**
 * Created by guoxw on 2017/5/24.
 *
 * @auther guoxw
 * @createTime 2017/5/24 13:16
 * @packageName com.example.guoxw.oopdemo.obsersverModel
 */

/**
 * 观察者
 * 观察者角色一般是一个接口，它只有一个update方法，在被观察者状态发生变化时，这个方法就会被触发调用。
 */
interface MyObserver {

    public void update();

}
