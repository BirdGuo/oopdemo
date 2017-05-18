package com.example.guoxw.oopdemo.prototypes.createrbuilders;

import android.util.Log;

import com.example.guoxw.oopdemo.prototypes.Dog;

/**
 * Created by guoxw on 2017/5/18.
 *
 * @auther guoxw
 * @createTime 2017/5/18 17:27
 * @packageName com.example.guoxw.oopdemo.prototypes.createrbuilders
 */
public class ConcreatePDog extends Dog {

    private String TAG = ConcreatePDog.class.getName().toString();

    public ConcreatePDog() {
    }

    public ConcreatePDog(String name, int age) {
        super(name, age);
    }

    public void show() {

        Log.i(TAG, this.getName() + "原型模式实现类");
    }
}
