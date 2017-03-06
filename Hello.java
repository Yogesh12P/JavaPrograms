import java.util.Scanner;
class Hello
{
	public static void main (String a[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name ;");
			String name;
			name = sc.next();
			System.out.println("Hello "+name);
		}
}
