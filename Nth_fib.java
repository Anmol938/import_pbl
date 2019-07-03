package pbl;
import java.util.*;


public class Nth_fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int input1 = sc.nextInt();
		
		int first = 0;
		int second = 1;
		int nth_fib = 0;
		for(int i = 3; i <=input1;i++)
		{
			nth_fib = first + second;
			System.out.println(i + " number --values ,," + " one back--->" + (first) + "---two back-->>" + (second)+"  current -->"+nth_fib);
			first = second;// this line has to come before
			second = nth_fib;
			 
			
			

		}
		
		System.out.println(nth_fib);
		
	}

}
