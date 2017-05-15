package com.example.guoxw.oopdemo.Factories.FactoryBean;

import android.util.Log;

import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.ICar;

/**
 * Created by gxw on 17-5-15.
 */
public class Benz implements ICar {

    private String TAG = Benz.class.getName().toString();

    @Override
    public void carMethod() {

        Log.i(TAG, "Benz--------------------carMethod");

    }
}
