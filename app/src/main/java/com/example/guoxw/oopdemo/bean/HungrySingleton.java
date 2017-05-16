package com.example.guoxw.oopdemo.bean;

/**
 * Created by guoxw on 2017/5/16.
 *
 * @auther guoxw
 * @createTime 2017/5/16 09:50
 * @packageName com.example.guoxw.oopdemo.bean
 */

/**
 * 饿汉模式
 * 饿汉式单例在单例类被加载时候，就实例化一个对象交给自己的引用
 */
public class HungrySingleton {

    private String name;
    private int age;

    private HungrySingleton() {
    }

    private HungrySingleton(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 获取单例
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return hungrySingleton;
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

    @Override
    public String toString() {
        return "HungrySingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
