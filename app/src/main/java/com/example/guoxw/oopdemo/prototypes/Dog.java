package com.example.guoxw.oopdemo.prototypes;

/**
 * Created by guoxw on 2017/5/17.
 *
 * @auther guoxw
 * @createTime 2017/5/17 10:25
 * @packageName com.example.guoxw.oopdemo.prototypes
 */

public class Dog implements Cloneable {

    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog clone() {
        Dog dog = null;
        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }

}
