package com.example.guoxw.oopdemo.MementoModel;

/**
 * Created by guoxw on 2017/9/4 0004.
 *
 * @author guoxw
 * @createTime 2017/9/4 0004 11:21
 * @packageName com.example.guoxw.oopdemo.MementoModel
 */

/**
 * 记录当前时刻的内部状态，负责定义哪些属于备份范围的状态，负责创建和恢复备忘录数据。
 */
public class Originator {

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }

}
