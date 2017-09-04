package com.example.guoxw.oopdemo.Aggregate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoxw on 2017/8/29 0029.
 *
 * @author guoxw
 * @createTime 2017/8/29 0029 10:44
 * @packageName com.example.guoxw.oopdemo.Aggregate
 */

public class ConcreateIterator implements Iterator {

    private List list = new ArrayList();
    private int cursor = 0;

    public ConcreateIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (cursor == list.size()) {
            return false;
        }
        return true;
    }
}
