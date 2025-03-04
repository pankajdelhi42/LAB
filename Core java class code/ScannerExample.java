import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class ScannerExample 
{
		public static void add()
		{
			int num1=0;
			int num2=0;
			
			//reading data from console
			System.out.println("enter the value for num1 and num2");
			Scanner s = new Scanner(System.in);
			num1 =s.nextInt();
			num2 =s.nextInt();
			
			int sum = 0;
			sum = num1+num2;
			System.out.println(sum);
		}
		
		public static void main(String[] args)
		{
		
			
			
		add();
			
			
			
			
				
		}
	

}
