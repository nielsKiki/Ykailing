package com.goolge.ketang.ketang2;

public class Chess extends BoardGame {
    Chess(){
        super(44);
        System.out.println("构造Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
