package JavaPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 5;
		long factorial = 1;
		// in ascending order
//		for (int i=1;i<=num;i++) {
//			factorial=factorial * i;//5 10 30 120 
//		}
		
		// in descending order
		for (int i=num;i>=1;i--)
		{
			factorial=factorial * i;
		}
    System.out.println(factorial);
	}

}
