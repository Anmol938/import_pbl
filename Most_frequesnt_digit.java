package pbl;

import java.util.Arrays;

public class Most_frequesnt_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input1[] = new int[] {1237,202,666,140};
		
		
		int count[] = new int[10];
		for(int i = 0 ; i < input1.length;i++)
		{

			String str = Integer.toString(input1[i	]);

			for(int j = 0 ; j < str.length();j++ )
			{
			count[ Character.getNumericValue(str.charAt(j)) ]++;
			}
	

		}

		int max = 0;

		for(int i = 0 ; i < count.length;i++)
		{

			if( max <= count[i])
				max = i;
		}
		
		
		System.out.println(Arrays.toString(count));
		
		
		
		
		
		
		
		
	}

}
