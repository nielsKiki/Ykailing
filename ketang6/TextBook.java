package com.goolge.ketang.ketang6;

public class TextBook extends ReadingMatterImpl{
    String name = "课本";

    @Override
    public void Effect() {
        System.out.println("课本是用来学习的！");
    }

    @Override
    public void FitObject() {
        System.out.println("课本最适合的使用对象是学生");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "name='" + name + '\'' +
                '}';
    }
}
