package com.example.guoxw.oopdemo.obsersverModel;

import android.util.Log;

/**
 * Created by guoxw on 2017/5/24.
 *
 * @auther guoxw
 * @createTime 2017/5/24 13:19
 * @packageName com.example.guoxw.oopdemo.obsersverModel
 */

public class ConcerateObserver2 implements MyObserver {

    @Override
    public void update() {
        Log.i("MainActivity", "-----------------ConcerateObserver2 update---------------------");
    }
}
