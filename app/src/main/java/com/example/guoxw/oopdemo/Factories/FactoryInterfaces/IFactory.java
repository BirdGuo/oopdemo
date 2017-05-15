package com.example.guoxw.oopdemo.Factories.FactoryInterfaces;

/**
 * Created by guoxw on 2017/5/15.
 *
 * @auther guoxw
 * @createTime 2017/5/15 17:44
 * @packageName com.example.guoxw.oopdemo.Factories.FactoryInterfaces
 */

import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.ICar;

/**
 * 工厂接口
 */
public interface IFactory {

    ICar createCar(int witch);

}
