package com.example.guoxw.oopdemo.Factories.FactoryBean;

import android.util.Log;

import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IVolkswagen;

/**
 * Created by gxw on 17-5-15.
 */

public class Volkswagen implements IVolkswagen {

    private String TAG = Volkswagen.class.getName().toString();

    @Override
    public void show() {

        Log.i(TAG, "show-------------------------Volkswagen");

    }
}
