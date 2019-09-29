public class ArrayLength{
    public static void main(String[] args){
	int[] a = new int[(int)(Math.random())*10];
	for(int i = 0;i < a.length; ++i)
		a[i] = (int)(Math.random()*10);
	for(int i =0;i < a.length ; ++i)
		System.out.println(a[i]);

	}
 
	}	