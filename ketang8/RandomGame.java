package ketang8;
/*
* author：杨凯玲
* */
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        //随机数字random
        Random r = new Random();
        int randomNum = r.nextInt(100)+1;

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("请输入猜测的数字：");
            int scanNum = s.nextInt();
            if(randomNum<scanNum){
                System.out.println("太大了,请重试！");
            }else if(randomNum>scanNum){
                System.out.println("太小了，请重试！");
            }else {
                System.out.println("恭喜你，猜中了！");
                break;//猜中退出
            }
        }
        System.out.println("游戏结束");
    }
}

