package com.example.guoxw.oopdemo.visitModel;

/**
 * Created by guoxw on 2017/8/4 0004.
 *
 * @auther guoxw
 * @createTime 2017/8/4 0004 13:38
 * @packageName com.example.guoxw.oopdemo.visitModel
 */

/**
 * 抽象类或者接口，声明访问者可以访问哪些元素，
 * 具体到程序中就是visit方法中的参数定义哪些对象是可以被访问的。
 */
public interface IVisitor {

    void visit(ConcreteElement1 concreteElement1);

    void visit(ConcreteElement2 concreteElement2);

}
