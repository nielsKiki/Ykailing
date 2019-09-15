public class SayHello{
    public static void main(String[] arge){
	    System.out.println("Bellow is the function of say hello");
		SayHello(sum());
	}
	public static void SayHello(int sum){
	    System.out.println("say hello!" + sum());
	}
	public static int sum(){
	    int sum=0;
		for(int i=0;i<=100;i++){
		    sum = sum + i;
		}
		return sum;
	}
}