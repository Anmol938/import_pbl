package pbl;

public class Single_sum_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String input2 ="odd";
	
	int input1 = 292;
	
	int sum =0;
		
		if(input2.equals("even"))
		{
			while(input1 > 0 || sum > 9)
				{
					if(input1 == 0  )
					{	input1 = sum;
						sum=0;
					
					}
					
				int temp = input1%10;
				
					if(temp%2 ==0)
					{ sum = sum + input1%10;
					//System.out.println(sum);
					}
					input1 = input1/10;
					
					
					
				}
		}
		else if(input2.equals("odd"))
		{
			while(input1 > 0 || sum > 9)
				{
					if(input1 == 0  )
					{	input1 = sum;
						sum=0;
					
					}
					
				int temp = input1%10;
				
					if(temp%2 != 0)
					{ sum = sum + input1%10;
					
					}
					input1 = input1/10;
					
					
					
				}
		}
	System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	
	}

}
