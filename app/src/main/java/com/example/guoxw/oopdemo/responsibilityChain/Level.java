package com.example.guoxw.oopdemo.responsibilityChain;

/**
 * Created by guoxw on 2017/8/21 0021.
 *
 * @auther guoxw
 * @createTime 2017/8/21 0021 14:20
 * @packageName com.example.guoxw.oopdemo.responsibilityChain
 */

public class Level {

    private int classLevel = 0;

    public Level(int classLevel) {
        this.classLevel = classLevel;
    }

    public boolean above(Level level) {
        if (this.classLevel > level.classLevel) {
            return true;
        }
        return false;
    }

}
