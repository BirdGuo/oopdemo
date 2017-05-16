package com.example.guoxw.oopdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.guoxw.oopdemo.Factories.AbstractCarFactory;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IAudi;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.ICar;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IVolkswagen;
import com.example.guoxw.oopdemo.Factories.SimpleCarFactory;
import com.example.guoxw.oopdemo.bean.HungrySingleton;
import com.example.guoxw.oopdemo.bean.LazySingleton;
import com.example.guoxw.oopdemo.mybuilder.Directors.Director;
import com.example.guoxw.oopdemo.mybuilder.Product;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getName().toString();

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

        HungrySingleton Malfurion = HungrySingleton.getInstance();
        Malfurion.setName("玛法里奥");
        Malfurion.setAge(1000);

        HungrySingleton Tyrande = HungrySingleton.getInstance();
        Tyrande.setName("泰兰德");
        Tyrande.setAge(999);

        LazySingleton Illidan = LazySingleton.getInstance("伊利丹", 1000);
        LazySingleton Gourdin = LazySingleton.getInstance("古尔丹", 20);

        Log.i(TAG, "hungry Malfurion:" + Malfurion.toString());
        Log.i(TAG, "hungry Tyrande:" + Tyrande.toString());
        Log.i(TAG, "lazy Illidan:" + Illidan.toString());
        Log.i(TAG, "lazy Gourdin:" + Gourdin.toString());

        Director director = new Director();
        Product benzProduct = director.getBenzProduct();
        benzProduct.showProduct();
        Product bmwProduct = director.getBMWProduct();

        benzProduct.showProduct();
        bmwProduct.showProduct();
        Log.i(TAG, "Director benzProduct" + benzProduct.toString());
        Log.i(TAG, "Director bmwProduct" + bmwProduct.toString());

    }
}
