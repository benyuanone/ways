package com.benyuan.designmodel;

import com.benyuan.designmodel.myinterface.IWaterState;

/**
 * Created by D.chen.g on 2018/4/17.
 * 状态模式
 */
public class WarmWaterState implements IWaterState{
    @Override
    public void printState() {
        System.out.println("我是热水");
    }
}
