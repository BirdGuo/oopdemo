package com.example.guoxw.oopdemo.OrderModel;

/**
 * Created by guoxw on 2017/8/21 0021.
 *
 * @auther guoxw
 * @createTime 2017/8/21 0021 11:37
 * @packageName com.example.guoxw.oopdemo.OrderModel
 */

import android.util.Log;

/**
 * Invoker类：调用者，负责调用命令。
 */
public class Invoker {

    /**
     * 命令
     */
    private Command command;

    /**
     * 设置命令
     *
     * @param command
     *         the command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action() {
        Log.i(Constants.TAG,"------------------action---------------");
        this.command.execute();
    }

}
