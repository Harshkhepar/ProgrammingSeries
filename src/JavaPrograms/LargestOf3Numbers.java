package JavaPrograms;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// This scanner class in java will give user a number you want to reverse
		System.out.println("Enter First Number :");
		int a = sc.nextInt();//1234

		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		
		System.out.println("Enter Third Number :");
		int c = sc.nextInt();
		
//		Approach 1:
		if (a>b&&a>c) {
			System.out.println("a is the largets number");
		}
		else if(b>c){
			System.out.println("b is the largest number");
		}
		else
		{
			System.out.println("c is the largest number");
		}
	


	// Approach 2 : using ternary operator(?)
	    int largest1 =  a>b?a:b;
	    //a>b--> its a condition we need to check and ?(TO) will give a if this condn is right 
	    // if condn is not right then it will give b then in that case b is largest
	    
	 int  largest2 = c>largest1?c:largest1;
	 System.out.println(largest2 +"is Largets number");
}
}