package com.goolge.ketang.ketang9;

public class Array {
    public static void main(String[] args) {

        Person[] array = new Person[3];

        Person one = new Person("TOm",19);
        Person two = new Person("Kiki",20);
        Person three = new Person("lina",25);

        array[0] = one;
        array[1] = two;
        array[2] = three;
        //地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[0].getName());//Tom
        System.out.println(array[0].getAge());//19
    }

}
