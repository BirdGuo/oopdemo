package com.example.guoxw.oopdemo.bean;

/**
 * Created by guoxw on 2017/5/16.
 *
 * @auther guoxw
 * @createTime 2017/5/16 09:55
 * @packageName com.example.guoxw.oopdemo.bean
 */

/**
 * 懒汉模式
 * 懒汉式在调用取得实例方法的时候才会实例化对象
 */
public class LazySingleton {

    private String name;
    private int age;

    private LazySingleton() {
    }

    private static LazySingleton lazySingleton;

    private LazySingleton(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取单例
     *
     * @param name
     * @param age
     *
     * @return
     */
    public static synchronized LazySingleton getInstance(String name, int age) {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton(name, age);
        }
        return lazySingleton;
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
        return "LazySingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
