package com.goolge.ketang.ketang6;

public class ReadingMatterImpl implements ReadingMatterInte{

    @Override
    public void Effect() {
        System.out.println("父类)可以阅读的");
    }

    @Override
    public void FitObject() {
        System.out.println("(父类)任何阶段的人都能读书");
    }

    public int getPrice() {
        return price;
    }
    public int getPagination() {
        return pagination;
    }
}
