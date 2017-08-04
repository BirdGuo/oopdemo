package com.example.guoxw.oopdemo.visitModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by guoxw on 2017/8/4 0004.
 *
 * @auther guoxw
 * @createTime 2017/8/4 0004 13:55
 * @packageName com.example.guoxw.oopdemo.visitModel
 */

public class ObjectStruture {

    public static List<Element> getList() {
        ArrayList<Element> elements = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(100);
            if (rand > 50) {
                elements.add(new ConcreteElement1());
            } else {
                elements.add(new ConcreteElement2());
            }
        }

        return elements;
    }

}
