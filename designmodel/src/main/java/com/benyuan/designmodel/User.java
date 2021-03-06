package com.benyuan.designmodel;

import com.benyuan.designmodel.myinterface.Observer;

/**
 * Created by D.chen.g on 2018/4/9.
 */
public class User  implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
