package com.example.guoxw.oopdemo.templateModel;

import android.util.Log;

/**
 * Created by gxw on 17-5-18.
 * 主逻辑实现
 */
public abstract class AbstractSort {

    private String TAG = AbstractSort.class.getName().toString();

    /**
     * 抽象方法：父类中只声明但不加以实现，而是定义好规范，然后由它的子类去实现。
     * @param arries
     */
    protected abstract void sort(int[] arries);

    /**
     * 模版方法：由抽象类声明并加以实现。一般来说，模版方法调用抽象方法来完成主要的逻辑功能，
     * 并且，模版方法大多会定义为final类型，指明主要的逻辑功能在子类中不能被重写。
     * @param arries
     */
    public void showSortResult(int[] arries) {
        this.sort(arries);
        Log.i(TAG, "排序结果");

        for (int array : arries) {
            Log.i(TAG, "" + array);
        }
    }

}
