package com.goolge.ketang.ketang6;

public class Magazine extends ReadingMatterImpl{
    String name = "杂志";
    String date = "30 day";

    @Override
    public void Effect() {
        System.out.println("这是继承了读物类的杂志类");
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
