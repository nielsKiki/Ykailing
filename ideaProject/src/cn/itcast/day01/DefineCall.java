package cn.itcast.day01;
/*
* 单独调用 方法名（参数）;      //void 是空的意思 返回值也为空 只能用在单独调用
* 打印调用 System.out.println(方法名（参数）);
* 赋值调用 数据类型 变量名 = 方法名（参数）;
* */
public class DefineCall {
    public static void main(String[] args) {
        //单独调用
        sum(13,12);
        System.out.println("----------------------");
        //打印调用
        System.out.println(sum(13,12));
        System.out.println("----------------------");
        //赋值调用
        int num = sum(13,12);
        System.out.println(num);

    }
    public  static int sum(int a,int b){
        System.out.println("方法执行！");
        return a + b ;
    }
}
