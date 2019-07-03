package pbl;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		int input1  = sc.nextInt();
		
		int flag = 0;
		for(int i = 2 ; i <= input1/2; i++)
		{
			if(input1%i == 0)
			{		flag = 1;
				break;
			}
		}
	if( flag == 1)
		System.out.println( 1);
	else 
		System.out.println( 2);
		
	}

}
