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
import com.example.guoxw.oopdemo.intermediaryModel.AbstractColleague;
import com.example.guoxw.oopdemo.intermediaryModel.AbstractMediator;
import com.example.guoxw.oopdemo.intermediaryModel.ColleagueA;
import com.example.guoxw.oopdemo.intermediaryModel.ColleagueB;
import com.example.guoxw.oopdemo.intermediaryModel.Mediator;
import com.example.guoxw.oopdemo.mybuilder.Directors.Director;
import com.example.guoxw.oopdemo.mybuilder.Product;
import com.example.guoxw.oopdemo.obsersverModel.ConcerateObserver1;
import com.example.guoxw.oopdemo.obsersverModel.ConcerateObserver2;
import com.example.guoxw.oopdemo.obsersverModel.ConcreateSubject;
import com.example.guoxw.oopdemo.obsersverModel.MySubject;
import com.example.guoxw.oopdemo.prototypes.createrbuilders.ConcreatePDog;
import com.example.guoxw.oopdemo.templateModel.createBuilder.ConCreateSort;
import com.example.guoxw.oopdemo.visitModel.Element;
import com.example.guoxw.oopdemo.visitModel.ObjectStruture;
import com.example.guoxw.oopdemo.visitModel.Visitor;

import java.util.List;

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

        //原型
        ConcreatePDog concreatePDog = new ConcreatePDog("gougou", 12);

        for (int i = 0; i < 10; i++) {
            ConcreatePDog clone = (ConcreatePDog) concreatePDog.clone();
            clone.setAge(i);
            clone.show();
        }

        int[] a = {10, 32, 1, 9, 5, 7, 12, 0, 4, 3}; // 预设数据数组
        ConCreateSort conCreateSort = new ConCreateSort();
        conCreateSort.showSortResult(a);

        AbstractColleague colleagueA = new ColleagueA();
        AbstractColleague colleagueB = new ColleagueB();

        AbstractMediator abstractMediator = new Mediator(colleagueA, colleagueB);

        Log.i(TAG, "---------------------------通过设置A影响B----------------------------");
        colleagueA.setNumber(10, abstractMediator);
        Log.i(TAG, "colleagueA:" + colleagueA.getNumber());
        Log.i(TAG, "colleagueB:" + colleagueB.getNumber());

        Log.i(TAG, "---------------------------通过设置B影响A----------------------------");
        colleagueB.setNumber(200, abstractMediator);
        Log.i(TAG, "colleagueA:" + colleagueA.getNumber());
        Log.i(TAG, "colleagueB:" + colleagueB.getNumber());

        MySubject subject = new ConcreateSubject();

        subject.addObserver(new ConcerateObserver1());
        subject.addObserver(new ConcerateObserver2());
        subject.doSomething();

        List<Element> list = ObjectStruture.getList();
        for (Element element : list){
            element.accept(new Visitor());
        }

    }
}
