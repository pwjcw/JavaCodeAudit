package org.example;

public class Student {
    public String name;
    public int age;
    private String addr;

    public String getName() {
        return name;
    }

    public Student(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
