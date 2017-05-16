package com.example.guoxw.oopdemo.mybuilder;

import android.util.Log;

/**
 * Created by guoxw on 2017/5/16.
 *
 * @auther guoxw
 * @createTime 2017/5/16 12:51
 * @packageName com.example.guoxw.oopdemo.mybuilder
 */

public class Product {

    private String TAG = "MainActivity";

    private String name;
    private int type;

    public Product() {
    }

    public Product(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void showProduct() {
       Log.i(TAG,"名称：" + name);
       Log.i(TAG,"型号：" + type);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
