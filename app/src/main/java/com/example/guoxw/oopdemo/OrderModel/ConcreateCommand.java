package com.example.guoxw.oopdemo.OrderModel;

/**
 * Created by guoxw on 2017/8/21 0021.
 *
 * @auther guoxw
 * @createTime 2017/8/21 0021 13:29
 * @packageName com.example.guoxw.oopdemo.OrderModel
 */

import android.util.Log;

/**
 * Command类的实现类，对抽象类中声明的方法进行实现。
 */
public class ConcreateCommand extends Command {

    private Receiver receiver;

    /**
     * Instantiates a new Concreate command.
     *
     * @param receiver
     *         the receiver
     */
    public ConcreateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        Log.i(Constants.TAG,"------------------execute---------------");
        receiver.doSomething();
    }
}
