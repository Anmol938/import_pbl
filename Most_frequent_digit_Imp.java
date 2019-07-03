package pbl;

import java.util.Arrays;

public class Most_frequent_digit_Imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input1=123,input2=456,input3=345,input4=5043;
		
		
		
		String in1 = Integer.toString(input1);
		String in2 = Integer.toString(input2);
		String in3 = Integer.toString(input3);
		String in4 = Integer.toString(input4);
		
		
		StringBuilder obj = new StringBuilder();

		obj.append(in1);
		obj.append(in2);
		obj.append(in3);
		obj.append(in4);

		String str = obj.toString();	
		char ch[] = str.toCharArray();
int count[] = new int[10];

		for(int i = 0 ;i < ch.length;i++)
		{
			count[ Character.getNumericValue(ch[i]) ]++;

		}

	int max= 0,value=0;

	for(int i = 0 ; i < count.length;i++)
	{
		if( max <= count[i])
				{max = count[i];
				value = i;	
				}
	}

		
		System.out.println(Arrays.toString(count ));
		System.out.println(max);
		System.out.println(value);
		
		
		
	}

}
