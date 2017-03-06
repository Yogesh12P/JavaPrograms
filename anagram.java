import java.lang.Math;
import java.util.Scanner;
import java.util.*;

class anagram
{
  public static void main(String arg[])
   {
	Scanner sc = new Scanner(System.in);
	
	String str1,str2;
	int flag;

	System.out.print("Enter the 1st string: ");
	str1 = sc.nextLine();

	System.out.print("Enter the 2nd string: ");
	str2 = sc.nextLine();

	int len1 = str1.length();
	int len2 = str2.length();

	if(len1!=len2)
	{
	    System.out.println("Strings are not anagram");
	}
	else
	{
	   for(int i=0;i<len1;i++)
	    {
		for(int j=0;j<len1;j++)
		{
			if(str1.charAt[i]==str2.charAt[j])
				flag=1;
			else
				flag=0;
		}
	    }
	}
  	
	if(flag==1)
	  System.out.println("Given string is anagram");
	else
	  System.out.println("Given string is not anagram");
 
  }
}
