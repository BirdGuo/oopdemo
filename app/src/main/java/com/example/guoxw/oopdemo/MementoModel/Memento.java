package com.example.guoxw.oopdemo.MementoModel;

/**
 * Created by guoxw on 2017/9/4 0004.
 *
 * @author guoxw
 * @createTime 2017/9/4 0004 11:33
 * @packageName com.example.guoxw.oopdemo.MementoModel
 */

/**
 * 负责存储发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
 */
public class Memento {

    private String state = "";

    public Memento() {
    }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
