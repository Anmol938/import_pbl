package pbl;

public class Nth_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input1 = 4;
int count = 2;
int num = 4;
		if(input1 == 1)
			System.out.println(2);
		else if(input1 == 2)
			System.out.println( 3);
		else
		{
				while(true)
				{int flag =0;
						
				
				for(int i =2;i <=num/2;i++ )
						{
							if(num%i==0)
								{
									flag = 1;
									break;

								}
						}
				
				
						if(flag == 0)
							count++;
						if(count==input1)
							break;	

						//System.out.println(count);
num++;
				}


				System.out.println(num);
		}



	}

}
