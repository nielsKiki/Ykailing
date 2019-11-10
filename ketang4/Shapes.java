package com.goolge.ketang.ketang4;
/*
* author 杨凯玲
*
* */
public class Shapes {
    public static Shape randShape(){
        switch ((int)(Math.random()*3)){
            default:
            case 0: return  new Circle();
            case 1: return  new Square();
            case 2: return  new Triangle();
        }
    }
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; ++i)
            s[i] = randShape();
        for (int i = 0; i < s.length; ++i)
            s[i].draw();

    }
}
