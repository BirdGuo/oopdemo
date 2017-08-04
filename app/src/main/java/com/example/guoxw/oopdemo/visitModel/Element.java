package com.example.guoxw.oopdemo.visitModel;

/**
 * Created by guoxw on 2017/8/4 0004.
 *
 * @auther guoxw
 * @createTime 2017/8/4 0004 13:37
 * @packageName com.example.guoxw.oopdemo.visitModel
 */

/**
 * 接口或者抽象类，声明接受哪一类访问者访问，程序上是通过accept方法中的参数来定义的。
 * 抽象元素一般有两类方法，一部分是本身的业务逻辑，另外就是允许接收哪类访问者来访问。
 */
public abstract class Element {

    public abstract void doSomething();

    public abstract void accept(IVisitor iVisitor);

}
