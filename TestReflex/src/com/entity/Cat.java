package com.entity;

public class Cat {
    private String name;
    public int  age;

    public Cat() {
    }
    public void hi(){
//        System.out.println("Hi");
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
