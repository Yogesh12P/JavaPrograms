import java.util.Scanner;

class harmonic
{
   public static void main(String arg[])
   {
        Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
	double result=0;

	for(double i=2;i<=n;i++)
	{
	   result = 1+(1.0f/i);
	}
	
	System.out.println("The "+n+"th harmonic no is"+result);
   }
}
