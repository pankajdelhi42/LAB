
public class ArrayExample
{

	public static int findmax(int[] n) 
	{ 
		int max=0;
          max = n[0];
		
		for(int i=0;i<5;i++)
		{

			if(max<n[i])
			{
				max = n[i];
			   	
			}
			
     	}	
	       n[4]=50;
	      return max;	
		
	}
	
	public static void main(String[] args) 
	{
//	   int sum =0;
//	   int max =0;
//		int[] num = new int[5];
		
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		
		
		int[] num = {100,400,600,900,500};
		
		int max=findmax(num);
		
		System.out.println("max value of the given array is "+max);
			
		
		for(int i =0;i<5;i++)
		{
			System.out.println(num[i]);
		}
		
		}
		
		
	}

	
		
	
	

