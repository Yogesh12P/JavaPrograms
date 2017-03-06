import java.util.Scanner;
import java.util.Random;

class gambler
{
    public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	
	int money,gain=5000,loss=4000;
	int n;
	double res;
	System.out.println("How many money you have");
	money = sc.nextInt();
	System.out.println("how much your budget :");
	int bud = sc.nextInt();
	System.out.println("how many mony you want :");
	int pro = sc.nextInt();

	System.out.print("How many round you have to play :");
	n = sc.nextInt();

	for(int i=0;i<n;i++)
	{
	  if(money>bud || money<pro)
	  {
	   res = Math.random();

		if(res<=0.5)
			money=money+gain;
		else
			money=money-loss;
	   }
	else
	 {
		break;
	 }
	}

	System.out.println("You have "+money+" money");
  }
}
