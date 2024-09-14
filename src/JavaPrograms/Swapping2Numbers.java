package JavaPrograms;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		//Logic 1:with using third variable
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping values are "+ a + " "+ b);
		
//		int t = a;
//		a=b;
//		b=t;
		
//		System.out.println("After swapping values are "+ a + " "+ b);
		
		// Logic 2 : use + and -, without using third variable
		
//		a= a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("After swapping values are "+ a + " "+ b);
		
		// Logic 3 : use * and /, without using third variable
		// here a & b should not be zero
		
//				a= a*b;// 10*20=200
//				b=a/b;//200/20 =10
//				a=a/b;//200/10 = 20
//				
//				System.out.println("After swapping values are "+ a + " "+ b);
				
		// Logic 4: single statement
				
		b=a+b -(a=b);// 30-20=10
		// execution starts from right to left
		System.out.println("After swapping values are "+ a + " "+ b);
		
	}

}
