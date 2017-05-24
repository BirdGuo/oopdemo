package com.example.guoxw.oopdemo.obsersverModel;

import java.util.Vector;

/**
 * Created by guoxw on 2017/5/24.
 *
 * @auther guoxw
 * @createTime 2017/5/24 10:56
 * @packageName com.example.guoxw.oopdemo.obsersverModel
 */

/**
 * 被观察者类
 * <p>
 * 从类图中可以看到，类中有一个用来存放观察者对象的Vector容器（之所以使用Vector而不使用List，是因为多线程操作时，Vector在是安全的，而List则是不安全的），
 * 这个Vector容器是被观察者类的核心，另外还有三个方法：attach方法是向这个容器中添加观察者对象；
 * detach方法是从容器中移除观察者对象；
 * notify方法是依次调用观察者对象的对应方法。
 * 这个角色可以是接口，也可以是抽象类或者具体的类，因为很多情况下会与其他的模式混用，所以使用抽象类的情况比较多。
 */
public abstract class MySubject {

    private Vector<MyObserver> obs = new Vector<MyObserver>();

    public void addObserver(MyObserver observer) {
        this.obs.add(observer);
    }

    public void delObserver(MyObserver observer) {
        this.obs.remove(observer);
    }

    protected void notfityObserver() {
        for (MyObserver observer : obs) {
            observer.update();
        }
    }

    public abstract void doSomething();

}
