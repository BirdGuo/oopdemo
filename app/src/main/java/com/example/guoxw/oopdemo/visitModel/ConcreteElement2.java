package com.example.guoxw.oopdemo.visitModel;

import android.util.Log;

/**
 * Created by guoxw on 2017/8/4 0004.
 *
 * @auther guoxw
 * @createTime 2017/8/4 0004 13:48
 * @packageName com.example.guoxw.oopdemo.visitModel
 */

public class ConcreteElement2 extends Element {

    private String TAG = "MainActivity";

    @Override
    public void doSomething() {
        Log.i(TAG, "这里是元素2");
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
