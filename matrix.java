import java.io.PrintWriter;
import java.util.Scanner;

public class matrix
{
     public static void main(String args[])
      {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of rows you want : ");
	int r = sc.nextInt();
	System.out.println("Enter the no of colomns you want : ");
        int c = sc.nextInt();
	int mat[][] = new int[r][c];

	System.out.println("Enter "+(r*c)+" elements in matrix :");

	for(int i=0;i<r;i++)
	 {
		for(int j=0;j<c;j++)
		 {
			mat[i][j] = sc.nextInt();
		 }
	 }

	System.out.println("Matrix view using simple method :");
	
	for(int i=0;i<r;i++)
         {
                for(int j=0;j<c;j++)
                 {
                       System.out.print(mat[i][j]+"\t");
                 }
		System.out.println("");
         }

	System.out.println("Matrix view using PrintWriter method: ");

	System.out.println("");

	PrintWriter ps = new PrintWriter(System.out);
	 for(int i=0;i<r;i++)
          {
               	for(int j=0;j<c;j++)
                 {
                       ps.print(mat[i][j]+"\t");
                 }
               ps.println("\n");
         }
	ps.close();
	

      }
}
