package practise_code;

import java.util.Scanner;

public class reverse_string
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ..: ");
		
		String str=sc.next();
		String rev="";
		
		int len=str.length();
		
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		
		
		
		System.out.println(rev);
		

	}

}
