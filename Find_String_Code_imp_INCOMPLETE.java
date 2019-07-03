package pbl;

import java.util.Arrays;

public class Find_String_Code_imp_INCOMPLETE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			String str = "WORLD WIDE WEB";
			str = str.toLowerCase();
			String concat = "";
			String strArr[] = str.split(" ");
			
			//System.out.println(Arrays.toString( strArr ));
			int sum = 0;
			
			
			
			
			
				String temp = strArr[1];
				
				//System.out.println(temp);
				
				if(temp.length()%2 != 0) 
				{
					int fi_ind = 0;
					int la_ind = temp.length()-1;
					
					while(fi_ind != la_ind)
					{
						 int t1 = (int)temp.charAt(fi_ind) - 96  ;
						
						 int t2 = (int) temp.charAt(la_ind) - 96 ;
						
						 
						 //System.out.println(t1 + "  " + t2);
						 
						 sum += Math.abs(t1-t2);
						 
						fi_ind++;
						la_ind--;
					}
					//System.out.println(fi_ind + "  " + la_ind);
					
					sum += (int)temp.charAt(fi_ind)-96;
					System.out.println("\n" + sum);
					 concat += Integer.toString(sum);
				
				
				}
				else
				{
					int fi_ind2 = 0;
					int la_ind2 = temp.length()-1;
					
					while(fi_ind2 != la_ind2)
					{
						 int t1 = (int)temp.charAt(fi_ind2) - 96  ;
						
						 int t2 = (int) temp.charAt(la_ind2) - 96 ;
						
						 
						 //System.out.println(t1 + "  " + t2);
						 
						 sum += Math.abs(t1-t2);
						 
						fi_ind2++;
						la_ind2--;
					}
					
					System.out.println("\n" + sum);
					 concat += Integer.toString(sum);
					
				}
			
			
		
		
	}

}
