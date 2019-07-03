package pbl;
import java.util.*;
public class Last_digit_of_two_numbers_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		if(input1 < 0 )
			input1 *= -1;
		if(input2 < 0)
		 	input2 *= -1;

		int sum = 0 ;
		sum = (input1%10) + (input2%10);

System.out.println(sum);
		
	
	
	
	}

}
