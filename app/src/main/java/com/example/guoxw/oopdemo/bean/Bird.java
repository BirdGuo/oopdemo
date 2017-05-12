package com.example.guoxw.oopdemo.bean;

/**
 * Created by guoxw on 2017/5/11.
 *
 * @auther guoxw
 * @createTime 2017 /5/11 17:57
 * @packageName com.example.guoxw.myapptest.beans
 */
public class Bird {


    //羽毛颜色
    private String featherColor;

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

    /**
     * Fly.
     */
    public void fly() {
        System.out.println("bird is flying");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }
}
