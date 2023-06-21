//Write a java program to check whether given string is palindrome or not?
package String_Practice;

public class Palindrome {

	    public static void main(String[] args) {
	        String str = "madam";
	        boolean isPalindrome = checkPalindrome(str);
	        
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }
	    
	    public static boolean checkPalindrome(String str) {
	        str = str.toLowerCase(); 
	        int left = 0;
	        int right = str.length() - 1;
	        
	        while (left < right) {
	            char leftChar = str.charAt(left);
	            char rightChar = str.charAt(right);
	            
	            if (leftChar != rightChar) {
	                return false; 
	            }
	            
	            left++;
	            right--;
	        }
	        
	        return true; 
	    }
	}
