package com.benyuan.designmodel;

import com.benyuan.designmodel.abstractclass.Colleague;
import com.benyuan.designmodel.abstractclass.Mediator;

/**
 * Created by D.chen.g on 2018/4/17.
 */
public class ColleagueB extends Colleague {


    public ColleagueB(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void getMessage(String message){
        System.out.println("同事B"+name+"获得信息"+message);
    }
    //同事A与中介者通信
    public void contact(String message){
        mediator.contact(message, this);
    }
}
