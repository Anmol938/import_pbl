package pbl;

public class Single_sum_even_IMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int input1 = 25000;
		int sum = 0;

		int flag = 0;
				if(input1 < 0)
					{input1 *= -1;
					flag = 1;
					}



				while(input1 > 0 || sum > 9)
				{
					if(input1 == 0  )
					{	input1 = sum;
						sum=0;
					
					}
					
				int temp = input1%10;
				
					if(temp%2 ==0)
					{ sum = sum + input1%10;
					System.out.println(sum);
					}
					input1 = input1/10;
					
					
					
				}
		if(flag == 1)
						sum *= -1;

		
		System.out.println(sum);
		System.out.println(input1);
		
		
		
		
		
		
		
	}

}
