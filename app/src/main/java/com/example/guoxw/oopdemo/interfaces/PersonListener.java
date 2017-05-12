package com.example.guoxw.oopdemo.interfaces;

import com.example.guoxw.oopdemo.evens.Even;

/**
 * Created by guoxw on 2017/5/12.
 *
 * @auther guoxw
 * @createTime 2017 /5/12 14:11
 * @packageName com.example.guoxw.oopdemo.interfaces
 */
public interface PersonListener {

    /**
     * Do run.
     *
     * @param even
     *         the even
     */
    void doRun(Even even);

}
