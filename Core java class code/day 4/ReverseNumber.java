import java.util.Scanner;

public class ReverseNumber
{
	public static int reverse(int num) 
	{ 
		
		int digit;
	  int res = 0;
		while(num>0)
		{
			digit = num%10;
			num = num/10;
			res = res*10+digit;
		//System.out.print(res);
				
		}
		return res;
	}
	
	
	

	
}
