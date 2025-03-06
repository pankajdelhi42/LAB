import java.util.Scanner;

public class TestReverse
{

	public static void main(String[] args) 
	{
	
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("enter the number to be reversed");
		num = s.nextInt();
		int res=ReverseNumber.reverse(num);
		System.out.println(res);
		
		
	}
	
	
}
