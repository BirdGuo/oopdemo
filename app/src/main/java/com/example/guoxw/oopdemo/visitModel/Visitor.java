package com.example.guoxw.oopdemo.visitModel;

/**
 * Created by guoxw on 2017/8/4 0004.
 *
 * @auther guoxw
 * @createTime 2017/8/4 0004 13:53
 * @packageName com.example.guoxw.oopdemo.visitModel
 */

/**
 * 实现抽象访问者所声明的方法，它影响到访问者访问到一个类后该干什么，要做什么事情。
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomething();
    }
}
