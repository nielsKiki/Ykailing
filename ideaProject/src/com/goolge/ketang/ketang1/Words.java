package com.goolge.ketang.ketang1;
/*
 * author 杨凯玲
 *
 * */
public class Words {
    public static void main(String[] args) {
        Dictionary xinhua = new Dictionary();
        System.out.println("页数"+xinhua.getPage());
        System.out.println("Definitions"+xinhua.getDefinitions());
        System.out.println("每页词条数"+xinhua.computerRtio());
    }
}
