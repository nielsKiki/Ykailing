package com.goolge.ketang.ketang7;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("无参构造方法执行！");
    }

    public Person(String name, int age) {
        System.out.println("全参构造方法执行");
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
