import java.util.Scanner;

class triple
{
  public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the no of integer : ");
	   int n = sc.nextInt();

	   int arr[] = new int[n];
	   
	   System.out.println("Enter totals numbers : ");
	   for(int i=0;i<n;i++)
	   {
		arr[i] = sc.nextInt();
	   }

	   for(int i=0;i<n;i++)
	   {
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]+arr[j]+arr[j+1]==0)
			{
				System.out.println("combination :"+i+" "+arr[i]+arr[j]+arr[j+1]);
			}
		}
	   }


	}
}
