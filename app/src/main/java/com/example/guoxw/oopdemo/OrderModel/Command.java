package com.example.guoxw.oopdemo.OrderModel;

/**
 * Created by guoxw on 2017/8/21 0021.
 *
 * @auther guoxw
 * @createTime 2017/8/21 0021 11:35
 * @packageName com.example.guoxw.oopdemo.OrderModel
 */

/**
 * Command类：是一个抽象类，类中对需要执行的命令进行声明，一般来说要对外公布一个execute方法用来执行命令。
 */
public abstract class Command {

    /**
     * 执行命令方法
     */
    public abstract void execute();

}
