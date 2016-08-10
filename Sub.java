import java.util.Scanner;


public class Sub {

	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		String a=s1.nextLine();
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the string");
		String b=s2.nextLine();
		if(b.contains(a))
		{
			System.out.println("entered string is a substring");
		}
		else{
			System.out.println("entered string is not a substring");
		}
	}

}
