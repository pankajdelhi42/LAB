
public class PrimitivePassing 
{

	public static void change(int a, int b) 
	{
	
		a = 40;
		b = 50;
		
	}
	public static void main(String[] args) 
	{
	
	int a = 10;
	int b = 20;
	System.out.println(a +", "+ b);
	
	change(a,b);
	
	System.out.println(a +" ,"+ b);
			
		
		
	}

	
	
	
	
}
