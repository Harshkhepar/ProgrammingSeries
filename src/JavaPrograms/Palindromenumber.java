package JavaPrograms;

import java.util.Scanner;

public class Palindromenumber {
// number when we reverse given exactly the same number: 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);// This scanner class in java will give user a number you want to reverse
		System.out.println("Enter a Number :");
		
		int num = sc.nextInt();
		int org_num = num;//16461
		
//		Logic 1 : Using algorithm
      int rev = 0;
      
      while(num!=0) {
      	rev = rev*10 + num%10; 
      	num = num/10; 
      }
      
      if(org_num == rev) {
          System.out.println(org_num + " is a Palindrome Number");
      }
      else {
    	  System.out.println(org_num + " is not Palindrome Number");
      }

		
	}

}
