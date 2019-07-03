package pbl;

import java.util.Arrays;

public class Second_word_sUPPERCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input1 = "Wipro Technologies Limited";
		
		String str_Arr[] = input1.split(" ");


        String str = str_Arr[1].toUpperCase();

        if( str_Arr.length < 2)
			System.out.println("LESS");
		else	
			System.out.println(str_Arr[1].toUpperCase() );
		
	}

}
