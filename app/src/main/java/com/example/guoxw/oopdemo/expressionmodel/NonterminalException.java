package com.example.guoxw.oopdemo.expressionmodel;

/**
 * Created by guoxw on 2017/9/4 0004.
 *
 * @author guoxw
 * @createTime 2017/9/4 0004 10:21
 * @packageName com.example.guoxw.oopdemo.expressionmodel
 */

public class NonterminalException extends Expression {

    public NonterminalException(Expression... expressions) {
    }

    @Override
    public Object interperter(MyContext context) {
        return null;
    }
}
