package com.example.guoxw.oopdemo.responsibilityChain;

import android.util.Log;

import com.example.guoxw.oopdemo.OrderModel.Constants;

/**
 * Created by guoxw on 2017/8/21 0021.
 *
 * @auther guoxw
 * @createTime 2017/8/21 0021 14:29
 * @packageName com.example.guoxw.oopdemo.responsibilityChain
 */

public abstract class HandlerLoc {

    private HandlerLoc nextHandler;

    public final Response handleRequest(Request request) {

        Response response = null;
        if (this.getHandlerLevel().above(request.getLevel())) {
            response = this.response(request);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            } else {
                Log.i(Constants.TAG, "-----没有合适的处理器-----");
            }
        }
        return response;
    }

    public void setNextHandler(HandlerLoc handlerLoc) {
        this.nextHandler = handlerLoc;
    }

    protected abstract Level getHandlerLevel();

    public abstract Response response(Request request);

}
