package com.example.guoxw.oopdemo.visitModel;

import android.util.Log;

/**
 * Created by guoxw on 2017/8/4 0004.
 *
 * @auther guoxw
 * @createTime 2017/8/4 0004 13:44
 * @packageName com.example.guoxw.oopdemo.visitModel
 */

/**
 * 实现抽象元素类所声明的accept方法，通常都是visitor.visit(this)，基本上已经形成一种定式了。
 */
public class ConcreteElement1 extends Element {
    private String TAG = "MainActivity";

    @Override
    public void doSomething() {
        Log.i(TAG, "这是元素1");
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }

}
