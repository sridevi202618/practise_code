package practise_code;

public class swapping2number 
{

	public static void main(String[] args) 
	{
	
		int a=20, b=10;	
		
		System.out.println("Before swapping values are :"+a+" ,"+b);	
		/*
		//logic 1 - third variable
		int swap=a;
		a=b;
		b=swap;
		System.out.println("After swapping values are :"+a+", "+b);
	
		
		//Logic 2 - use + and - operators without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Logic 2 - After swapping values are :"+a+", "+b);
		*/
		
		//Logic 3 - use * and / operator without using 3rd var and a and b val should not zero
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Logic 3  - After swapping values are :"+a+", "+b);
		
		
		
	}

}
