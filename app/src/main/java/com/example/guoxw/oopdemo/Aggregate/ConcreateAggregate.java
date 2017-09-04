package com.example.guoxw.oopdemo.Aggregate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoxw on 2017/8/29 0029.
 *
 * @author guoxw
 * @createTime 2017/8/29 0029 11:03
 * @packageName com.example.guoxw.oopdemo.Aggregate
 */

public class ConcreateAggregate implements MyAggregate {

    private List list = new ArrayList();

    public void add(Object obj) {
        list.add(obj);
    }

    public Iterator iterator() {
        return new ConcreateIterator(list);
    }

    @Override
    public int size() {
        return list.size();
    }

    public void remove(Object obj) {
        list.remove(obj);
    }


}
