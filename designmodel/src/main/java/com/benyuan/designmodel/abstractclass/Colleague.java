package com.benyuan.designmodel.abstractclass;

/**
 * Created by D.chen.g on 2018/4/17.
 * 中介者模式-同事类
 */
public abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
