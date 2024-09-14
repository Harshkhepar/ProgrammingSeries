package JavaPrograms;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		int num = 12345678;
		int num1;
		int even_count =0;
		int odd_count  =0;
		while(num>0) {
			num1 = num%10;
			if (num1%2==0){
			  even_count++;
			}
			else{
			  odd_count++;
			}
			num = num/10;
			}
        System.out.println("Number of Even Digits :"+even_count);
        System.out.println("Number of Odd Digits :"+odd_count);
	}

	}


