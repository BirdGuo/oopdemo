package com.example.guoxw.oopdemo.bean;

import com.example.guoxw.oopdemo.evens.FlyEven;
import com.example.guoxw.oopdemo.interfaces.BirdFlyListener;
import com.example.guoxw.oopdemo.interfaces.Eat;

/**
 * Created by guoxw on 2017/5/11.
 *
 * @auther guoxw
 * @createTime 2017 /5/11 17:57
 * @packageName com.example.guoxw.myapptest.beans
 */
public class Bird implements Eat {


    //羽毛颜色
    private String featherColor;

    private BirdFlyListener birdFlyListener;

    /**
     * Instantiates a new Bird.
     */
    public Bird() {
    }

    /**
     * Instantiates a new Bird.
     *
     * @param featherColor
     *         the feather color
     */
    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }

    /**
     * Gets feather color.
     *
     * @return the feather color
     */
    public String getFeatherColor() {
        return featherColor;
    }

    /**
     * Sets feather color.
     *
     * @param featherColor
     *         the feather color
     */
    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public BirdFlyListener getBirdFlyListener() {
        return birdFlyListener;
    }

    public void setBirdFlyListener(BirdFlyListener birdFlyListener) {
        this.birdFlyListener = birdFlyListener;
    }

    /**
     * Fly.
     */
    public void fly() {
        if (birdFlyListener != null) {
            FlyEven flyEven = new FlyEven(this);
            birdFlyListener.doFly(flyEven);
            System.out.println("bird is flying");
        }
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }

    @Override
    public void eatFood(String foodName) {
        System.out.println("bird is eating " + foodName);
    }
}
