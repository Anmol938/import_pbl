package pbl;

public class Is_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			int var = 251;
		
			String orig = Integer.toString(252);
			
			StringBuilder obj = new StringBuilder();
			
			
			obj.append(orig);
			obj = obj.reverse();
		
				String rev = obj.toString();
				
				
				System.out.println(orig);
				System.out.println(rev);
				
			/*	if( orig.equals(rev))
					System.out.println("Plaindrome");
				else
					System.out.println("Not a palindrome");
		*/		
	}

}
