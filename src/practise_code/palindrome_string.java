package practise_code;

import java.util.Scanner;

public class palindrome_string 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ...: ");
		String str=sc.next();
		String orgstr=str;
		String rev="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(orgstr.equals(rev))
		{
			System.out.println("Palindrome string..");
		}
		else
		{
			System.out.println("Not a Palindrome string..");
		}
	}

}
