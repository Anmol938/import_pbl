package pbl;
import java.util.*;

public class last_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
	
		int input1 = sc.nextInt();
		
		
		
		if(input1 < 0)
			input1 *=-1;
			
		 
		System.out.println(input1%10);
		
	}

}
