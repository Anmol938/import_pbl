package pbl;

public class Weight_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input1 = "Hello World!!";
int input2 = 1; // valu can be 1 or 0
		
		int sum = 0;
		input1 = input1.toLowerCase();

						for(int  i = 0 ; i < input1.length();i++)
						{

							int ch = (int)input1.charAt(i);

							if(input2 == 1)
							{
									if( ch >= 97 && ch <= 122)
										sum += ch-96;
							}
							else 
							{
								 if( ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117);
								 else if(ch>=97 && ch <= 122)
									 sum += ch-96;
							
							}	


						}

		
		System.out.println(sum);
		
	}

}
