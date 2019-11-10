package com.goolge.ketang.ketang3;
/*
 * author 杨凯玲
 *
 * */
import java.util.*;

public class Manage {
    public static void main(String[] args) {
        UserList user1 = new UserList("Kiki","1717");
        UserList user2 = new UserList("Tom","9898");

        //链表
        List l= new LinkedList();
        l.add(user1);
        l.add(user2);
        System.out.println(l.get(0).toString());
        System.out.println("-----------------------");
        //数组
        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        System.out.println(list.get(1).toString());
        System.out.println("-----------------------");
        //map
        Map<String,String> map1 = new HashMap<>();
        map1.put("Kiki","9999d");
        System.out.println(map1.get("Kiki"));

    }

}
