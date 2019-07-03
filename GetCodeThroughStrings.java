package pbl;

public class GetCodeThroughStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input1 = "Hello Tango To Charlie";
		
		
		String str[] = input1.split(" ");

		int initial_sum = 0;


		for(int i = 0 ; i < str.length;i++)
		{

				initial_sum += str[i].length();

		}

	int sum = 0;

		while(initial_sum > 0 || sum > 9)
		{
			if(initial_sum == 0)
			{
				initial_sum = sum;
				sum =0;
			}

			sum += initial_sum%10;
			initial_sum /= 10;	
		}


		System.out.println( sum ) ;

		
		
		
	}

}
