package pbl;

public class Prime_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int input1 = 2;
	       int input2 = 10;
	       
	        int flag = 0,count=0;
	        
	       for(int i = input1;i<=input2;i++)
	       {
	           flag=0;
	           
	           for( int j =2;j<=i/2;j++)
	           {
	        	  // System.out.println(i+"-----------------"+j);
	        	   
	               if( i%j==0)
	               {
	                   flag=1;
	                   break;
	               }
	               
	               
	           }
	          // System.out.println("\n\n");
	           
	           if(flag == 0)
	                {count++;
	               // System.out.println(i+"<---prime number");
	                }
	       }
	     System.out.println(count);
		
		
		
		
	}

}
