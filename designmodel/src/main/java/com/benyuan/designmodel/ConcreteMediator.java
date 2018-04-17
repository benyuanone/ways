package com.benyuan.designmodel;

import com.benyuan.designmodel.abstractclass.Colleague;
import com.benyuan.designmodel.abstractclass.Mediator;

/**
 * Created by D.chen.g on 2018/4/17.
 * 中介者模式--具体中介者
 */
public class ConcreteMediator extends Mediator{
    ColleagueA collA;
    ColleagueB collB;

    public ColleagueA getCollA() {
        return collA;
    }

    public void setCollA(ColleagueA collA) {
        this.collA = collA;
    }

    public ColleagueB getCollB() {
        return collB;
    }

    public void setCollB(ColleagueB collB) {
        this.collB = collB;
    }

    @Override
    public void contact(String content, Colleague coll) {
        if (coll==collA) {
            collB.getMessage(content);
        } else {
            collA.getMessage(content);
        }
    }

    /**
     * @param args
     */
    // 中介者，ColleagueA、ColleagueB
    public static void main(String[] args) {
        // 定义中介者
        ConcreteMediator mediator = new ConcreteMediator();
        // 定义具体同事类
        ColleagueA colleagueA = new ColleagueA("张三", mediator);
        ColleagueB colleagueB = new ColleagueB("李四", mediator);
        // 中介者知晓每一个具体的Colleague类
        mediator.setCollA(colleagueA);
        mediator.setCollB(colleagueB);
        colleagueA.contact("我是A，我要和同事B说说工作的事情");
        colleagueB.contact("我是B,我下午有时间,下午商量吧");
    }
}
