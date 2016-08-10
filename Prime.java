import java.util.Scanner;


public class Prime {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int flag;
	
		if(n%2==0)
		{
			flag=1;
		}
		else
		{
			flag=0;
		}
		if(flag==0){
			 System.out.println("prime no is"+n);
		}
		else{
			System.out.println("not a prime");
		}
		}
	}
       
