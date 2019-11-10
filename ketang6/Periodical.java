package com.goolge.ketang.ketang6;

public class Periodical extends ReadingMatterImpl{
    String name ="期刊";
    String date ="7 day";


    @Override
    public void Effect() {
        System.out.println("期刊");
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "期刊：" +  "价格 = " + price + " , 页数 = " + pagination + " , 出版周期 = " + date;
    }
}
