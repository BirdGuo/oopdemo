package com.example.guoxw.oopdemo.evens;

import com.example.guoxw.oopdemo.bean.Bird;

/**
 * Created by guoxw on 2017/5/15.
 *
 * @auther guoxw
 * @createTime 2017/5/15 16:57
 * @packageName com.example.guoxw.oopdemo.evens
 */

public class FlyEven {

    private Bird bird;

    public FlyEven() {
    }

    public FlyEven(Bird bird) {
        this.bird = bird;
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }
}
