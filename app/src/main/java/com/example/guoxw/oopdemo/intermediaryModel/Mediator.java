package com.example.guoxw.oopdemo.intermediaryModel;

/**
 * Created by guoxw on 2017/5/22.
 *
 * @auther guoxw
 * @createTime 2017/5/22 10:19
 * @packageName com.example.guoxw.oopdemo.intermediaryModel
 * <p>
 * 中介实现类
 */
public class Mediator extends AbstractMediator {

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    @Override
    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number * 10);
    }

    @Override
    public void BaffectA() {
        int number = B.getNumber();
        A.setNumber(number / 10);
    }
}
