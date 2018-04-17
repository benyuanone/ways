package com.benyuan.designmodel;

import com.benyuan.designmodel.myinterface.IWaterState;

/**
 * Created by D.chen.g on 2018/4/17.
 */
public class IceWaterState implements IWaterState{
    @Override
    public void printState() {
        System.out.println("我是冰水");
    }
}
