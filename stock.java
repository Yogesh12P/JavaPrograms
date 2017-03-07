import java.util.Scanner;
import java.lang.*;

class stock
{

    public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.print("Enter how much no of data you want: ");
	n = sc.nextInt();
	
	int share[] = new int[n];
	String name[] = new String[n];
	double price[] = new double[n];

	System.out.println("Enter data :");

	for(int i=0;i<n;i++)
	{
	    System.out.print("Enter name :");
	    name[i] = sc.next();
	    System.out.print("Enter no of share :");
	    share[i] = sc.nextInt();
	    System.out.print("Enter price :");
	    price[i] = sc.nextDouble();
	}

	double amt[] = new double[n];
	double tamt=0;
	
	System.out.println("name \t share \t price \t amount");
	for(int i=0;i<n;i++)
	{
	    amt[i]=share[i]*price[i];
	    System.out.println(name[i]+"\t"+share[i]+"\t"+price[i]+"\t"+amt[i]);
	    tamt = amt[i]+tamt;
	}
	
	System.out.println("Total share amount is "+tamt);

     }

}
