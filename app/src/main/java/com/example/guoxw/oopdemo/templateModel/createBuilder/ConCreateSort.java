package com.example.guoxw.oopdemo.templateModel.createBuilder;

import com.example.guoxw.oopdemo.templateModel.AbstractSort;

import java.util.Arrays;


/**
 * Created by gxw on 17-5-18.
 * 剩下的逻辑实现
 */
public class ConCreateSort extends AbstractSort {

    /**
     * 钩子方法
     *
     * 比较灵活。因为有钩子方法，因此，子类的实现也可以影响父类中主逻辑的运行。
     * 但是，在灵活的同时，由于子类影响到了父类，违反了里氏替换原则，
     * 也会给程序带来风险。这就对抽象类的设计有了更高的要求。
     * @param arries
     */
    @Override
    protected void sort(int[] arries) {
        Arrays.sort(arries);
    }
}
