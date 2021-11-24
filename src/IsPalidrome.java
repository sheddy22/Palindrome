import java.util.Scanner;

public class IsPalidrome {

	    public static void main(String[] args) {
	        //String string = Terminal.getString("String:");
	    	Scanner scan = new Scanner(System.in);
	    	System.out.print("Enter a string: ");
	    	String string = scan.next();
	        if (isPalindrome(string)) {
	            System.out.print("\"" + string + "\" is a palindrome ...");
	        } else {
	            System.out.print("\"" + string + "\" is not a palindrome ...");
	        }

	    }

	    
	    public static boolean isPalindrome(String s) {
	    	if (s.length() < 2)
	    		return true;
	    	return s.charAt(0) == s.charAt(s.length()-1) && isPalindrome(s.substring(1,s.length()-1));
	    }
	    
	    
	    
	    
//	    public static boolean isPalindrome(String s) {

	    	
//	        int i = 0;
//
//	        for(int j= string.length() - 1; i < j; --j) {
//	            if (string.charAt(i) != string.charAt(j)) {
//	             System.out.println("true");
//	            	// return false;
//	            }
//
//	            ++i;
//	        }
//
//	       
//	        	System.out.println("false");
//	       // return true;
//	    }

}
