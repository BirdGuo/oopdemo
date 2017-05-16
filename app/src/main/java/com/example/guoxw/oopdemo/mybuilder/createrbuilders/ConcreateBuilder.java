package com.example.guoxw.oopdemo.mybuilder.createrbuilders;

import com.example.guoxw.oopdemo.mybuilder.Product;
import com.example.guoxw.oopdemo.mybuilder.builders.Builder;

/**
 * Created by guoxw on 2017/5/16.
 *
 * @auther guoxw
 * @createTime 2017/5/16 12:57
 * @packageName com.example.guoxw.oopdemo.mybuilder
 */

public class ConcreateBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void setPart(String name, int type) {
        product.setName(name);
        product.setType(type);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
