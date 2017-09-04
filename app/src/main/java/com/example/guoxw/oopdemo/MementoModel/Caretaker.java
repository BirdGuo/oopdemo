package com.example.guoxw.oopdemo.MementoModel;

/**
 * Created by guoxw on 2017/9/4 0004.
 *
 * @author guoxw
 * @createTime 2017/9/4 0004 11:34
 * @packageName com.example.guoxw.oopdemo.MementoModel
 */

/**
 * 对备忘录进行管理，保存和提供备忘录。
 */
public class Caretaker {

    private Memento memento;

    public Caretaker() {
    }

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
