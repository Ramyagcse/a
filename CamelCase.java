
public class CamelCase {

	public static void main(String[] args) {
		String s1="hello";
		String a="";
		char s2=s1.charAt(0);
		String s3=Character.toString(s2);
		String s4=s3.toUpperCase();
		String s5=s1.substring(1);
		a=s4+s5;
		System.out.println(a);
	}
}
