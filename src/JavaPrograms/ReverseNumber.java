package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);// This scanner class in java will give user a number you want to reverse
		System.out.println("Enter a Number :");
		
		int num = sc.nextInt();//1234
// you can directly take no. --> int num = 1234;
		
//		Logic 1 : Using algorithm
//        int rev = 0;
//        
//        while(num!=0) {
//        	rev = rev*10 + num%10; //0+1234%10=4    40+3=43    430+2=432  4320+1=4321
//        	num = num/10; // 1234/10 =123   123/10=12  12/10=1 1/10=0
//        }
//        System.out.println("Reverse num is :"+ rev);
		
		//Logic 2: Using Stringbuffer class
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
////		StringBuffer sb = new StringBuffer("1234");
//		StringBuffer rev =sb.reverse();
//		 System.out.println("Reverse num is :"+ rev);
		
		
		//Logic 3 ; StringBuilder class
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);// appends the specified string to character sequence
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);
	}

}
