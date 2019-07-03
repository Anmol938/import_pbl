package pbl_assesments;

import java.util.Arrays;

public class Lowest_digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int	input1 = 23792;
	int input2 = 37221;
	int input3 = 10270;
	int input4 = 73391;
	int input5 = 12005;
	
	
	int sum = 0;
	 sum += find(input1);
	 sum += find(input2);
	 sum += find(input3);
	 sum += find(input4);
	 sum += find(input5);
	
	
	System.out.println(sum);
	
	
	
	
		
	}
	
	
	public static int find(int input1)
	{
		int array[] = new int[ Integer.toString(input1).length() ];
		
		int  i = 0 ;
		while(input1 > 0)
		{
			
			array[i] = input1%10;
			input1 /= 10;
			i++;
			
		}
		
		
		Arrays.sort(array);
		
		int sum = array[0]*100 + array[1]*10 + array[2]*1;
		System.out.print(Arrays.toString( array) + "-------"  + sum +"\n");;
		
		return sum;
				
	}
	

}
