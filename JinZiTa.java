/*
*Description：Enter the number of layers and then display the pyramid.
*Author：     yangkailing
*Data：       2019-9-21
*/
package pm;
import java.util.Scanner;
public class JinZiTA{
	private static Scanner sc;
	public static void main(String[] args){
		int i,j,k,n;//变量n为层数，j为空格数，k为$的数，i为行数。
		sc = new Scanner(System.in);
		System.out.print("请输入金字塔的层数：");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++){
				System.out.print("$");
			}
			System.out.print("\n");
		}
		
	}
}