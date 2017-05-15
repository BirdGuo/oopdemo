package com.example.guoxw.oopdemo.Factories;

/**
 * Created by gxw on 17-5-15.
 */

import com.example.guoxw.oopdemo.Factories.FactoryBean.Audi;
import com.example.guoxw.oopdemo.Factories.FactoryBean.Volkswagen;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IAbstractCarFactory;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IAudi;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IVolkswagen;

/**
 * 抽象工厂方法
 *
 */
public class AbstractCarFactory implements IAbstractCarFactory {


    @Override
    public IAudi createAudi() {
        return new Audi();
    }

    @Override
    public IVolkswagen createVolksagen() {
        return new Volkswagen();
    }
}
