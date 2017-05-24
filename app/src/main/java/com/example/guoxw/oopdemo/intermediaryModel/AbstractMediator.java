package com.example.guoxw.oopdemo.intermediaryModel;

/**
 * Created by guoxw on 2017/5/22.
 *
 * @auther guoxw
 * @createTime 2017/5/22 10:14
 * @packageName com.example.guoxw.oopdemo.intermediaryModel
 * <p>
 * 抽象中介类
 */
public abstract class AbstractMediator {

    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();

}
