import java.util.Scanner;


public class Age{
	public static void main(String[] agrs){
		
		System.out.print("please input age ");
		Scanner scan = new Scanner(System.in);
	    int type;
		int age =scan.nextInt();
		System.out.println("your age is " + age);
		
		if(age <= 15){
			type = 1;
		}
		else{
			type = 2;
		}
		/*type = age/15;
		switch(type){
			case 1:
				System.out.println("nihao,xiaojiejie");
			    break;
			default:
			    System.out.print("nihao,xiaojiejie");
		}
		*/
		switch(type){
			case 1:
				System.out.println("nihao,xiaojiejie");
			    break;
			case 2:
			    System.out.println("nihao,dajiejie");
			    break;
			default:
			    System.out.print("error!");
		}
	}
}