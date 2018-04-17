package com.benyuan.designmodel;

import com.benyuan.designmodel.myinterface.IUserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by D.chen.g on 2018/4/9.
 */
public class JdkProxyFactory {
    private Object target;
    public JdkProxyFactory(Object object){
        this.target=object;
    }

    public Object proxyTarget(){
        Object result= Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object object = null;
                System.out.println("真实角色调用之前的处理....."+proxy.getClass());
                object = method.invoke(target, args);//激活调用的方法
                System.out.println("真实角色调用之后的处理....."+object);
                return object;
            }
        });
        return result;
    }

    public static void main(String[] args) {
        IUserDao userDao=new UserDao();
        JdkProxyFactory factory=new JdkProxyFactory(userDao);
        IUserDao userDaoproxy= (IUserDao)factory.proxyTarget();

    }

}
