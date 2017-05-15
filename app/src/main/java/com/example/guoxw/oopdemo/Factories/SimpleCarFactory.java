package com.example.guoxw.oopdemo.Factories;

/**
 * Created by guoxw on 2017/5/15.
 *
 * @auther guoxw
 * @createTime 2017/5/15 17:40
 * @packageName com.example.guoxw.oopdemo.Factories
 */

import com.example.guoxw.oopdemo.Factories.FactoryBean.BMW;
import com.example.guoxw.oopdemo.Factories.FactoryBean.Benz;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IFactory;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.ICar;

/**
 * 在工厂中组装车辆
 * <p>
 * 如果Sample有个继承如MySample, 按照面向接口编程,我们需要将Sample抽象成一个接口.ISample是接口,有两个子类MySample 和HisSample .
 *
 * 简单工厂模式就是把相同或者类似的类抽象成接口，然后在工厂类中选择进行实例化
 */
public class SimpleCarFactory implements IFactory {

//抽象
    @Override
    public ICar createCar(int witch) {

        ICar iCar = null;
        switch (witch) {
            case 1:
                iCar = new BMW();
                break;
            case 2:
                iCar = new Benz();
                break;
        }
        return iCar;
    }
}
