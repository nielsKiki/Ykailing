package cn.itcast;

/*生日蜡烛

        某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。

        现在算起来，他一共吹熄了236根蜡烛。

        请问，他从多少岁开始过生日party的？

        请填写他开始过生日party的年龄数。
        注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。*/

public class Exercise002 {
    public static void main(String[] args) {
        //从age岁开始，count吹蜡烛个数
        int age=0,i,count=0;

        while(age<100){
             for(i = age; count<236 ; i++){
                 count =+ i;
                 if(count == 236){
                     break;
                 }
             }
             if(count == 236)
                 break;
             age++;
             count = 0;
        }
        System.out.println(age);
    }
}
