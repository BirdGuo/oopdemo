package com.example.guoxw.oopdemo.obsersverModel;

import android.util.Log;

/**
 * Created by guoxw on 2017/5/24.
 *
 * @auther guoxw
 * @createTime 2017/5/24 13:21
 * @packageName com.example.guoxw.oopdemo.obsersverModel
 */

/**
 * 具体的被观察者
 * <p/>
 * 使用这个角色是为了便于扩展，可以在此角色中定义具体的业务逻辑。
 */
public class ConcreateSubject extends MySubject {
    @Override
    public void doSomething() {
        Log.i("MainActivity", "--------------------ConcreateSubject doSomething--------------------");
        this.notfityObserver();
    }
}
