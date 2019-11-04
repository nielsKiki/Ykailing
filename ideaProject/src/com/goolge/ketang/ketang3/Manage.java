package com.goolge.ketang.ketang3;
/*
 * author 杨凯玲
 *
 * */
import java.util.ArrayList;
import java.util.List;

public class Manage {
    public static void main(String[] args) {
        UserList user1 = new UserList("Kiki","1717");
        UserList user2 = new UserList("Tom","9898");

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);

        System.out.println(list.get(0).toString());
    }

}
