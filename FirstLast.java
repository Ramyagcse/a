import java.util.Scanner;


public class FirstLast {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=s.nextInt();
		int sum=0;
		int a=n%10;
		while(n>9){
			n/=10;
			
		}
		sum=a+n;
		System.out.println(sum);
	}

}
