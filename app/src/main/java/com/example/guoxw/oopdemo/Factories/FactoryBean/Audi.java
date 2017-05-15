package com.example.guoxw.oopdemo.Factories.FactoryBean;

import android.util.Log;

import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IAudi;

/**
 * Created by gxw on 17-5-15.
 */

public class Audi implements IAudi{

    private String TAG = Audi.class.getName().toString();

    @Override
    public void show() {
        Log.i(TAG,"show-----------------Audi");
    }
}
