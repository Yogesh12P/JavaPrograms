import java.util.Scanner;
import java.lang.Math;

class prime
{
   public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the no");
		n = sc.nextInt();
		int m = n;
		for(int j=2;n%2==0;j=j+2)
		{
			System.out.println(j);
			n=n/2;
		}
		
		for(int i=3;i<=m/2;i+=2)
		{
			if (m%i == 0)
			{
			  System.out.println(i+" ");
			  n=n/i;
			}
		}

		if(n<2)
		System.out.println(n);
	}
}
