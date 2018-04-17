package com.benyuan.designmodel;

import com.benyuan.designmodel.myinterface.IUserDao;

/**
 * Created by D.chen.g on 2018/4/9.
 * JDK动态proxy
 */
public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("实现类：保存");
    }

    @Override
    public void delete() {
        System.out.println("实现类：删除");
    }
}
