package com.example.guoxw.oopdemo.interfaces;

/**
 * Created by guoxw on 2017/5/12.
 * <p>
 * 这个在bean里是具体实现的方法
 * <p>
 * 只关心方法而不关心bean
 *
 * @auther guoxw
 * @createTime 2017 /5/12 14:00
 * @packageName com.example.guoxw.oopdemo.interfaces
 */
public interface Eat {

    /**
     * Eat food.
     *
     * @param foodName
     *         the food name
     */
    void eatFood(String foodName);

}
