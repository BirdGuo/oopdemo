package com.example.guoxw.oopdemo.mybuilder.builders;

import com.example.guoxw.oopdemo.mybuilder.Product;

/**
 * Created by guoxw on 2017/5/16.
 *
 * @auther guoxw
 * @createTime 2017/5/16 12:54
 * @packageName com.example.guoxw.oopdemo.mybuilder
 */

public abstract class Builder {

    public abstract void setPart(String name, int type);

    public abstract Product getProduct();

}
