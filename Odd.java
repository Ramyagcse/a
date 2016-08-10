import java.util.Scanner;
public class Odd {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int even=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				even=even+i;
					
			}
		}
		System.out.println(even);
	}

}
