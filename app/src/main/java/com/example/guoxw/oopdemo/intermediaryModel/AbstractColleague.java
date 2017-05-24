package com.example.guoxw.oopdemo.intermediaryModel;

/**
 * Created by guoxw on 2017/5/22.
 *
 * @auther guoxw
 * @createTime 2017/5/22 10:08
 * @packageName com.example.guoxw.oopdemo.intermediaryModel
 * <p>
 * 抽象中介者
 */
public abstract class AbstractColleague {

    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setNumber(int number, AbstractMediator abstractMediator);

}
