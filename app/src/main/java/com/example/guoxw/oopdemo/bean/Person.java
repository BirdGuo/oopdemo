package com.example.guoxw.oopdemo.bean;

import com.example.guoxw.oopdemo.evens.Even;
import com.example.guoxw.oopdemo.interfaces.Eat;
import com.example.guoxw.oopdemo.interfaces.PersonListener;

import java.io.Serializable;

/**
 * The type Person.
 * <p>
 * 3.1创建一个人类，人具有跑、吃的方法　　（创建一个事件源）
 * <p>
 * 　　3.2创建一个接口用来监视人的跑、吃　　　（事件监听器）
 * <p>
 * 　　3.3创建一个事件对象，里面用来封装人(Person)这个对象　　（事件对象）
 * <p>
 * 　　3.4创建一个测试类，用来测试Java监听机制
 */
public class Person implements Serializable, Eat {

    private String name;
    private int age;

    //1.1首先定义一个私有的、空的监听器对象，用来接收传递进来的事件监听器(相当于一个全局变量)
    private PersonListener personListener;

    //1.2将传递进来的事件监听器付给1.1中的listener
    public void registerPersonLisntener(PersonListener personListener) {
        this.personListener = personListener;
    }

    /**
     * Instantiates a new Person.
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Instantiates a new Person.
     *
     * @param name
     *         the name
     * @param age
     *         the age
     */
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name
     *         the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age
     *         the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public void eatFood(String foodName) {
        System.out.println(name + " is eating " + foodName);
    }

    public void runFast() {
        if (personListener != null) {
            Even even = new Even(this);
            personListener.doRun(even);
        }
        System.out.println("-----------runFast---------");
        System.out.println(name + " is running");
    }
}
