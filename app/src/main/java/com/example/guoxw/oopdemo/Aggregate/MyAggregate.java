package com.example.guoxw.oopdemo.Aggregate;

/**
 * Created by guoxw on 2017/8/29 0029.
 *
 * @author guoxw
 * @createTime 2017/8/29 0029 10:58
 * @packageName com.example.guoxw.oopdemo.Aggregate
 */

public interface MyAggregate {

    public void add(Object obj);
    public void remove(Object obj);
    public Iterator iterator();

    public int size();

}
