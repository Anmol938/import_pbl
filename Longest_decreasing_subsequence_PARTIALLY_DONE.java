package pbl;

import java.util.Arrays;

public class Longest_decreasing_subsequence_PARTIALLY_DONE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = new int[] {15,27,14,38,63,55,46,65,62,61,60,50,-5,41,42,10,9,8,7,6,5,4,3,2,1};
		
		/*         not able to count the number of sequences
		
		int count =0;
		
		
			int k = 0;
			while(k < array.length-1)
			{
			if( array[k] > array[k+1])
			{
				count++;
				while( (array[k] > array[k+1]) && k+1 < array.length-1)
				{
					if(k++ < array.length-1)
						k++;
				}
				
				
			System.out.println(count);	
			}
			k++;
			}
					
			
		
		
		
		System.out.println("GOD SAVE US " + count);
		
		
		*/
		
		
		
		
		int lds[] = new int[array.length];
		
		for(int i = 0 ; i < array.length;i++)
		{
				
			lds[i] = 1;
			
			
		}
		
		
		
		
			for(int i = 1; i < array.length;i++)
			{
				
				
					
						if(  array[i] < array[i-1])
						{
							lds[i] = lds[i-1] + 1;
						}
					
				
				
				
			}
		
			System.out.println(Arrays.toString(array));	
		System.out.println(Arrays.toString(lds));
		
		int max= 0;
		for(int i = 0 ; i < lds.length;i++ )
		{
			if(max < lds[i])
				max = lds[i];
		}
		System.out.println(max);
		
		
		
		
				
		
		
		
		
		
		

	}

}
