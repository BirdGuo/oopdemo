package com.example.guoxw.oopdemo.Factories;

/**
 * Created by guoxw on 2017/5/15.
 *
 * @auther guoxw
 * @createTime 2017/5/15 17:40
 * @packageName com.example.guoxw.oopdemo.Factories
 */

import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IFactory;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.ICar;

/**
 * 在工厂中组装车辆
 */
public class CarFactory implements IFactory{


    @Override
    public ICar createCar() {
        return null;
    }
}
