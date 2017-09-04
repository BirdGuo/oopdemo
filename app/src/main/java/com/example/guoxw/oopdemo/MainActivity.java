package com.example.guoxw.oopdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.guoxw.oopdemo.Aggregate.ConcreateAggregate;
import com.example.guoxw.oopdemo.Aggregate.Iterator;
import com.example.guoxw.oopdemo.Aggregate.MyAggregate;
import com.example.guoxw.oopdemo.Factories.AbstractCarFactory;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IAudi;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.ICar;
import com.example.guoxw.oopdemo.Factories.FactoryInterfaces.IProduct.IVolkswagen;
import com.example.guoxw.oopdemo.Factories.SimpleCarFactory;
import com.example.guoxw.oopdemo.OrderModel.ConcreateCommand;
import com.example.guoxw.oopdemo.OrderModel.Invoker;
import com.example.guoxw.oopdemo.OrderModel.Receiver;
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
import com.example.guoxw.oopdemo.responsibilityChain.ConCreateHandler1;
import com.example.guoxw.oopdemo.responsibilityChain.ConCreateHandler2;
import com.example.guoxw.oopdemo.responsibilityChain.ConCreateHandler3;
import com.example.guoxw.oopdemo.responsibilityChain.Level;
import com.example.guoxw.oopdemo.responsibilityChain.Request;
import com.example.guoxw.oopdemo.responsibilityChain.Response;
import com.example.guoxw.oopdemo.strategy.ConcreateStrategy1;
import com.example.guoxw.oopdemo.strategy.ConcreateStrategy2;
import com.example.guoxw.oopdemo.strategy.MyContext;
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
        for (Element element : list) {
            element.accept(new Visitor());
        }

        //命令模式
        client();

        //责任链模式
        clientResponse();

        //策略模式
        clientStrategy();

        //迭代器模式
        clientAggregate();

    }

    /**
     * 命令模式 具体调用类
     * 客户端
     */
    private void client() {

        //接受者
        Receiver receiver = new Receiver();
        //具体命令
        ConcreateCommand concreateCommand = new ConcreateCommand(receiver);
        //执行命令 客户端直接执行具体命令方式（此方式与类图相符） //这步不是必要的
//        concreateCommand.execute();

        //客户端通过调用者来执行命令
        Invoker invoker = new Invoker();
        invoker.setCommand(concreateCommand);
        invoker.action();

    }

    /**
     * 责任模式客户端
     */
    private void clientResponse() {
        ConCreateHandler1 conCreateHandler1 = new ConCreateHandler1();
        ConCreateHandler2 concreateHandler2 = new ConCreateHandler2();
        ConCreateHandler3 conCreateHandler3 = new ConCreateHandler3();

        conCreateHandler1.setNextHandler(concreateHandler2);
        concreateHandler2.setNextHandler(conCreateHandler3);

        Response response = conCreateHandler1.handleRequest(new Request(new Level(20)));

    }

    /**
     * 策略模式
     */
    private void clientStrategy() {

        MyContext myContext;
        Log.i("GXW", "-------------执行策略1------------");
        myContext = new MyContext(new ConcreateStrategy1());
        myContext.execute();

        Log.i("GXW", "-------------执行策略2------------");
        myContext = new MyContext(new ConcreateStrategy2());
        myContext.execute();


    }

    /**
     * 迭代器模式
     */
    private void clientAggregate() {
        MyAggregate ag = new ConcreateAggregate();
        ag.add("小明");
        ag.add("小红");
        ag.add("小刚");
        Iterator it = ag.iterator();
        Log.i("GXW", "----------clientAggregate---------:" + ag.size());
        while (it.hasNext()) {
            String str = (String) it.next();
//            System.out.println(str);
            Log.i("GXW", "----------" + str);
        }
    }

}
