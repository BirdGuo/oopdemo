package com.example.guoxw.oopdemo.responsibilityChain;

/**
 * Created by guoxw on 2017/8/21 0021.
 *
 * @auther guoxw
 * @createTime 2017/8/21 0021 14:26
 * @packageName com.example.guoxw.oopdemo.responsibilityChain
 */

public class Request {

    private Level level;

    public Request(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
