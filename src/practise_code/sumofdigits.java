package practise_code;

public class sumofdigits
{

	public static void main(String[] args)
	{
		int num=173;
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
