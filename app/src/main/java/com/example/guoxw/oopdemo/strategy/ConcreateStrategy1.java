package com.example.guoxw.oopdemo.strategy;

import android.util.Log;

/**
 * Created by guoxw on 2017/8/28 0028.
 *
 * @author guoxw
 * @createTime 2017/8/28 0028 13:51
 * @packageName com.example.guoxw.oopdemo.strategy
 */

public class ConcreateStrategy1 implements IStrategy {
    @Override
    public void doSomething() {
        Log.i("GXW","具体策略1");
    }
}
