package JavaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);// This scanner class in java will give user a number you want to reverse
		System.out.println("Enter a String :");
		
		String str = sc.next();
		String org_str = str;//'RACECAR '
		
		String rev = "";
		
		int len = str.length();//4
		
		for (int i = len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		 if(org_str.equals(rev)) {
	          System.out.println(org_str + " is a Palindrome String");
	      }
	      else {
	    	  System.out.println(org_str + " is not Palindrome String");
	      }
		

	}

}
