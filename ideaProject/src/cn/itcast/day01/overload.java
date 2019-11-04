package cn.itcast.day01;
/*
*重载方法
* 参数个数不同
* 参数类型不同
* 参数类型顺序不同
* */
public class overload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));//30

        System.out.println(sum(1.2,2.0));//3

        System.out.println(sum(10,20,20));//50

        System.out.println(sum(1.6,9));//10

        System.out.println(sum(9,4.1));//13

        System.out.println(same(10,10));
        System.out.println(same(20,10));
    }
    public static int sum(int a,int b){
        System.out.println("两个int参数的方法执行");
        return a + b;
    }
    public static  int sum(double a,double b){
        System.out.println("执行类型转换double-> int!");
        return (int)(a + b);
    }
    public static int sum(double a,int b){
        System.out.println("a变量执行类型转换double-> int!");
            return(int)(a + b);
    }
    public static int sum(int a,double b){
        System.out.println("b变量执行类型转换double-> int!");
        return(int)(a + b);
    }
    public static int sum(int a,int b,int c){
        System.out.println("三个int参数的方法执行");
        return a + b + c;
    }


    public static boolean same(int a,int b){
        return a == b ;
    }
}
