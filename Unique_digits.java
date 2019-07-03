package pbl;
import java.util.*;

public class Unique_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int t = 292;
		char ch []= Integer.toString(t).toCharArray();
		
		
		int count[] = new int[10];
		
		
		for(int i = 0 ; i < ch.length;i++)
		{
		 count[ Character.getNumericValue(ch[i]) ]++;
		
		}
				
				System.out.println(Arrays.toString(count));
				
				for(int i = 0 ;i< count.length;i++)
				{
					
					
					if(count[i] !=0)
						System.out.println(i);
				}
	}

}
