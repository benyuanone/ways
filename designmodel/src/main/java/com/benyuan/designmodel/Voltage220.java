package com.benyuan.designmodel;

/**
 * Created by D.chen.g on 2018/4/17.
 * 适配器模式-实物
 */
public class Voltage220 {
    public int output220V() {
        int src = 220;
        System.out.println("我是" + src + "V");
        return src;
    }
}
