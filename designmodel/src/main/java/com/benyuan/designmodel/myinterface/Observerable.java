package com.benyuan.designmodel.myinterface;

/**
 * Created by D.chen.g on 2018/4/9.
 * 观察者模式-被观察者
 */
public interface Observerable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
