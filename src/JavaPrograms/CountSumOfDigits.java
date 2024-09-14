package JavaPrograms;

public class CountSumOfDigits {

	public static void main(String[] args) {
		int num = 1234567;
		int num1;
		int sum = 0;
		
		while (num>0) {
			num1 = num%10;
			sum=sum+num1;
			num=num/10;
		}
   System.out.println(sum);
	}

}
