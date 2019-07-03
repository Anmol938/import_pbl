package pbl;
import java.util.*;
public class secnond_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		int input1 = sc.nextInt();
		int value = 0;
		if(input1 < 10 && input1 >= 0 )
			value = 0;
		else if( input1 < 0 && input1 > -10)
			value = 0;
		else
		{
			if(input1 < 0)
		  		input1 *= -1;
			int mid_value  = input1/10;
			value = mid_value%10;
		}
				
 System.out.println(value);
		
	}

}
