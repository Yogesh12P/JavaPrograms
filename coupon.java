import java.util.Scanner;
import java.util.Random;

class coupon
{

   static   Scanner sc = new Scanner(System.in);

   public static void main(String args[])
   {
     int n;
     
     
     System.out.println("Enter the no of random number you want");
     n = sc.nextInt();
     randoms(n);
   }
   static   void randoms(int n)
   {
     System.out.println("Enter the range of random number you want");
     int num=sc.nextInt();

     for(int i=0;i<n;i++)
     {
	Random r = new Random();
	int random=r.nextInt(n);
	System.out.println("coupon number is :"+random);
     }
   }
}
