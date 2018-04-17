package com.benyuan.designmodel;

import com.benyuan.designmodel.myinterface.Voltage5;

/**
 * Created by D.chen.g on 2018/4/17.
 * 适配器模式-适配器
 */
public class VoltageAdapter extends Voltage220 implements Voltage5 {
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("适配器工作开始适配电压");
        int dst = src / 44;
        System.out.println("适配完成后输出电压：" + dst);
        return dst;
    }

}
