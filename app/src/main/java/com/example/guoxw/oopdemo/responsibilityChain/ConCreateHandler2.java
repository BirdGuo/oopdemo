package com.example.guoxw.oopdemo.responsibilityChain;

import android.util.Log;

import com.example.guoxw.oopdemo.OrderModel.Constants;

/**
 * Created by guoxw on 2017/8/21 0021.
 *
 * @auther guoxw
 * @createTime 2017/8/21 0021 14:42
 * @packageName com.example.guoxw.oopdemo.responsibilityChain
 */

public class ConCreateHandler2 extends HandlerLoc {
    @Override
    protected Level getHandlerLevel() {
        return new Level(3);
    }

    @Override
    public Response response(Request request) {
        Log.i(Constants.TAG, "-----请求由处理器2进行处理-----");
        return null;
    }
}
