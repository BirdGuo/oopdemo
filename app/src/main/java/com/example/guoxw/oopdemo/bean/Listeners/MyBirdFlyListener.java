package com.example.guoxw.oopdemo.bean.Listeners;

import com.example.guoxw.oopdemo.bean.Bird;
import com.example.guoxw.oopdemo.evens.FlyEven;
import com.example.guoxw.oopdemo.interfaces.BirdFlyListener;

/**
 * Created by guoxw on 2017/5/15.
 *
 * @auther guoxw
 * @createTime 2017/5/15 16:59
 * @packageName com.example.guoxw.oopdemo.bean.Listeners
 */

public class MyBirdFlyListener implements BirdFlyListener {
    @Override
    public void doFly(FlyEven flyEven) {
        Bird bird = flyEven.getBird();

        System.out.println(bird.getFeatherColor() + "的鸟在飞之前执行的动作");
    }
}
