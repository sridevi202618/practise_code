package practise_code;

import java.util.Scanner;

public class reverse_number
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		
		/*
		//using algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		//using logic 2 string buffer class
		

		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		*/
		
		//Using STring builder class
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("Rve number is : " + rev);
		
	}

}
