package org.pwjcw.StaticProxy;

import org.pwjcw.Hello;

public class Persion implements Hello {
    @Override
    public void Say(String name) {
        System.out.println(name+" Say Hello!");
    }
}
