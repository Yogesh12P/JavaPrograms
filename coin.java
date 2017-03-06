import java.util.Scanner;
import java.util.Random;

class coin
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			double result;
			int a;
			System.out.println("How many times you want to flip coin..?");
			a = sc.nextInt();
			int i=0,head=0,tail=0;
			while(i<a)
			{
				result = Math.random();
				if(result<=0.5)
				{
				  head++;
				  System.out.println("HEAD");
				}
				else
				{
				  tail++;
				  System.out.println("TAIL");
				}
				i++;
			}
	
			double per,per1;
			per = (head*100)/a;
			per1=100-per;
			
			System.out.println("head "+per+"% tail "+per1+"%");
		}
}
