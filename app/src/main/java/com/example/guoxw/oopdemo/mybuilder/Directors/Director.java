package com.example.guoxw.oopdemo.mybuilder.Directors;

import com.example.guoxw.oopdemo.mybuilder.Product;
import com.example.guoxw.oopdemo.mybuilder.builders.Builder;
import com.example.guoxw.oopdemo.mybuilder.createrbuilders.ConcreateBuilder;

/**
 * Created by guoxw on 2017/5/16.
 *
 * @auther guoxw
 * @createTime 2017/5/16 13:16
 * @packageName com.example.guoxw.oopdemo.mybuilder.Directors
 */
public class Director {

    private Builder builder = new ConcreateBuilder();

    public Product getBMWProduct() {
        builder.setPart("BMW", 1);
        return builder.getProduct();
    }

    public Product getBenzProduct() {
        builder.setPart("Benz", 2);
        return builder.getProduct();
    }

}
