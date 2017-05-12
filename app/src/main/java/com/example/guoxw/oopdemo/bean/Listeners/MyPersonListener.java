package com.example.guoxw.oopdemo.bean.Listeners;

import com.example.guoxw.oopdemo.bean.Person;
import com.example.guoxw.oopdemo.evens.Even;
import com.example.guoxw.oopdemo.interfaces.PersonListener;

/**
 * Created by guoxw on 2017/5/12.
 *
 * @auther guoxw
 * @createTime 2017/5/12 14:24
 * @packageName com.example.guoxw.oopdemo.bean.Listeners
 */

public class MyPersonListener implements PersonListener {

    @Override
    public void doRun(Even even) {
        Person person = even.getPerson();
        System.out.println(person.getName() + "在跑之前执行的动作");
    }
}
