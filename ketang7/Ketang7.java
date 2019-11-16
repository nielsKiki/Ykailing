package com.goolge.ketang.ketang7;

public class Ketang7 {
    public static void main(String[] args) {
        Person per1 = new Person();
        System.out.println("=========================");

        Person per2 = new Person("迪丽热巴",23);
        System.out.println("姓名："+ per2.getName() +"年龄：" + per2.getAge());
        System.out.println("=========================");

        System.out.println("用set___修改Age");
        per2.setAge(29);
        System.out.println("姓名："+ per2.getName() +"年龄：" + per2.getAge());
    }
}
