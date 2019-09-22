/*
*Description：Multiplication table
*Author：     yangkailing
*Data：       2019-9-21
*/
public class Table{
	public static void main(String[] args){
		System.out.println("Multiplication table:");
		int sum = 1;
		//定义一个变量sum与j作比较，完成换行
		for(int i = 1;i <= 9; i++){
			
			for(int j = 1;j <= 9; j++){
				System.out.printf(" %d * %d = %d", j , i , j*i);
				if(j == sum){
					System.out.printf("\n");
					break;
				}
				else{
					System.out.printf(" ");
				}
			}
			
			sum++;
		}
	}
}