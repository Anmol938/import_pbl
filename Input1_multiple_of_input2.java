package pbl;

import java.util.Scanner;

public class Input1_multiple_of_input2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc = new Scanner(System.in);
	
	int input1 = sc.nextInt();
	int input2 = sc.nextInt();
	
	int value=0;
	if( input1 == 0  || input2 == 0)
		value = 3;
	else
	{	
	if( input1%input2 == 0)
		value = 2;
	else
		value = 1;	
	}
System.out.println( value );

		
		
		
	}

}
