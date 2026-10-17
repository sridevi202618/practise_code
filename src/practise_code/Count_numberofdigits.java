package practise_code;

public class Count_numberofdigits 
{

	public static void main(String[] args)
	{
		
		int num=1265464687;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println(count);
	}

}
