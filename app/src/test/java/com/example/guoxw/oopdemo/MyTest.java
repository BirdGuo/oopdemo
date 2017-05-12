package com.example.guoxw.oopdemo;

import com.example.guoxw.oopdemo.bean.Child;
import com.example.guoxw.oopdemo.bean.Listeners.MyPersonListener;
import com.example.guoxw.oopdemo.bean.Parent;
import com.example.guoxw.oopdemo.evens.Even;
import com.example.guoxw.oopdemo.interfaces.PersonListener;

import org.junit.Test;

/**
 * Created by guoxw on 2017/5/12.
 *
 * @auther guoxw
 * @createTime 2017/5/12 14:25
 * @packageName com.example.guoxw.oopdemo
 */

public class MyTest {

    @Test
    public void testListener() {

        Child child = new Child("杰诺斯", 12, "琦玉", "Z时小学");
        child.registerPersonLisntener(new MyPersonListener());
        System.out.println("before child run");
        //出发监听
        child.runFast();
        child.eatFood("hot dog");

        /*-----------------------------------------------------------------------------------------------*/

        Parent parent = new Parent("琦玉", 23, "英雄协会");
        parent.registerPersonLisntener(new PersonListener() {
            @Override
            public void doRun(Even even) {
                System.out.println(even.getPerson().getName() + " before running");
            }
        });
        System.out.println("before parent run");
        //出发监听
        parent.runFast();
        parent.eatFood("sandwich");

    }

}
