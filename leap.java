import java.util.Scanner;

class leap
{
   public static void main(String arg[])
	{
	   System.out.println("Program for leap year");
	   Scanner sc = new Scanner(System.in);
	   int year;
	   System.out.println("Enter the year");
	   year = sc.nextInt();

		if(year%4==0 && year%400==0 || year%100!=0)
		{
			System.out.println("Given year is Leap year");
		}
		else
		{
			System.out.println("Given year is not leap year");
		}
	}
}
