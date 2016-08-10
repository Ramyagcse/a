import java.util.Scanner;
public class Week {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the day");
		String n=s.nextLine();
		if(n.equals("saturday")||n.equals("sunday"))
		{
			System.out.println(false);
		}
		else
		{
			System.out.println(true);
		}
	}

}
