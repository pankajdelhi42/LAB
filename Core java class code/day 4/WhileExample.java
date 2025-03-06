import java.util.Scanner;

public class WhileExample 
{

	public static void main(String[] args) 
	{
	int i =0;
	int n = 5;
	int sum = 0;
	Scanner s = new Scanner(System.in);
	int num;
		while(i<n)
		{
			num = s.nextInt();
			//System.out.println(i);
			i++;
			sum = sum+num;
		}
		
		System.out.println(sum);
		
	}
	
	
}
