package cn.itcast.day01;
/*
*
* 求出1-100所有数字的和值
* */
public class For {
    public static void main(String[] args) {
        System.out.println("结果是"+num());
        }


     public static int num() {
        /*
        * 方法
        * 返回值 sum
        * 變量 i sum
        * */
         int sum = 0;
         for (int i = 1; i <= 100; i++) {
             sum += i;
         }
         return sum;
     }
}

