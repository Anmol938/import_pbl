package pbl;

import java.util.Arrays;

public class Is_palindrome_posiible_IMportant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var = 1122311;
		
		int count[] = new int[10];
		
		while( var > 0)
		{
			count[var%10]++;
			
			var /= 10;
			
			
		}
		System.out.println(Arrays.toString(count));
		
		int flag_1 = 0;
		
		
		
		
		for(int i = 0 ; i < count.length;i++)
		{
				if(count[i]%2 != 0)
					flag_1++;
		}
		
		
		if(flag_1 >1)
			System.out.println("fasle");
		else
			System.out.println("true");
		
	}

}
