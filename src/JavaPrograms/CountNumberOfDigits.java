package JavaPrograms;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num = 123456;
		int count =0;
		while(num>0) {
			num = num/10;
		//	count++;
			count = count+1;
			
		}
        System.out.println("Number of Digits :"+count);
	}

}
