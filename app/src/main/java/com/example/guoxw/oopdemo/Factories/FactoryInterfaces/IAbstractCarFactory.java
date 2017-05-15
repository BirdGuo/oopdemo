package com.example.guoxw.oopdemo.Factories.FactoryInterfaces;

import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IAudi;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IVolkswagen;

/**
 * Created by gxw on 17-5-15.
 */

public interface IAbstractCarFactory {

    IAudi createAudi();
    IVolkswagen createVolksagen();

}
