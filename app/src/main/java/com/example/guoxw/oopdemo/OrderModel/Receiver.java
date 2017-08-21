package com.example.guoxw.oopdemo.OrderModel;

import android.util.Log;

/**
 * Created by guoxw on 2017/8/21 0021.
 *
 * @auther guoxw
 * @createTime 2017/8/21 0021 13:29
 * @packageName com.example.guoxw.oopdemo.OrderModel
 */

/**
 * 接收者，负责接收命令并且执行命令。
 */
public class Receiver {

    /**
     *
     */
    public void doSomething() {
        Log.i(Constants.TAG, "接受者-业务逻辑处理");
    }

}
