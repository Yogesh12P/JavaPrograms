import java.util.Scanner;

class power
{
	public static void main(String args[])
	  {
		Scanner sc = new Scanner(System.in);
		int n,p;
		System.out.println("enter the no");
		n= sc.nextInt();
		
		System.out.println(" ");
		for(int i=2;i<n;i++)
		{
			n=n*i;
			System.out.println(n);
		}
	  }
}
