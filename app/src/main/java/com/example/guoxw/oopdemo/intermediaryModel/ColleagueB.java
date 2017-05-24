package com.example.guoxw.oopdemo.intermediaryModel;

/**
 * Created by guoxw on 2017/5/22.
 *
 * @auther guoxw
 * @createTime 2017/5/22 10:06
 * @packageName com.example.guoxw.oopdemo.intermediaryModel
 * <p>
 * 同事类B
 */
public class ColleagueB extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator abstractMediator) {
        this.number = number;
        abstractMediator.BaffectA();
    }
}
