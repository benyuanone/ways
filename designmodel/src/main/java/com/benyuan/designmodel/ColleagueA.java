package com.benyuan.designmodel;

import com.benyuan.designmodel.abstractclass.Colleague;
import com.benyuan.designmodel.abstractclass.Mediator;

/**
 * Created by D.chen.g on 2018/4/17.
 * 中介者模式-具体同事类A
 */
public class ColleagueA extends Colleague {


    public ColleagueA(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void getMessage(String message){
        System.out.println("同事A"+name+"获得信息"+message);
    }
    //同事A与中介者通信
    public void contact(String message){
        mediator.contact(message, this);
    }
}
