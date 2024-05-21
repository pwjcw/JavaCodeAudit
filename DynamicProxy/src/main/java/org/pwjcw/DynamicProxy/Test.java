package org.pwjcw.DynamicProxy;

import org.pwjcw.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    Hello hello=new Hello() {
        @Override
        public void Say(String name) {
            System.out.println("Say Hello");
        }
    };
    HelloInvocationHandler helloInvocationHandler =new HelloInvocationHandler(hello);
    //创建代理对象
    Proxy.newProxyInstance();
}
