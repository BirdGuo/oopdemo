package com.example.guoxw.oopdemo.intermediaryModel;

/**
 * Created by guoxw on 2017/5/22.
 *
 * @auther guoxw
 * @createTime 2017/5/22 10:05
 * @packageName com.example.guoxw.oopdemo.intermediaryModel
 * <p>
 * 同事类A
 */
public class ColleagueA extends AbstractColleague {


    @Override
    public void setNumber(int number, AbstractMediator abstractMediator) {
        this.number = number;
        abstractMediator.AaffectB();
    }
}
