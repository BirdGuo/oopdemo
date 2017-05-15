package com.example.guoxw.oopdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.guoxw.oopdemo.Factories.AbstractCarFactory;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IAudi;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.ICar;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IVolkswagen;
import com.example.guoxw.oopdemo.Factories.SimpleCarFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        ICar bmw = simpleCarFactory.createCar(1);

        bmw.carMethod();

        ICar benz = simpleCarFactory.createCar(2);
        benz.carMethod();

        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        IAudi audi = abstractCarFactory.createAudi();
        audi.show();
        IVolkswagen volksagen = abstractCarFactory.createVolksagen();
        volksagen.show();

    }
}
