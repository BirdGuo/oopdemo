package com.example.guoxw.oopdemo.evens;

import com.example.guoxw.oopdemo.bean.Person;

/**
 * Created by guoxw on 2017/5/12.
 * <p>
 * 对javaBean类的一个封装
 *
 * @auther guoxw
 * @createTime 2017/5/12 14:12
 * @packageName com.example.guoxw.oopdemo.evens
 */

public class Even {

    private Person person;

    public Even(Person person) {
        this.person = person;
    }

    public Even() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
