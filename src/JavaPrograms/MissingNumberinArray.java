package JavaPrograms;

public class MissingNumberinArray {

	public static void main(String[] args) {

		// Array should not have any duplicate
		// Array : No need to  be sorted order
		// Value should be in range
		
		int a[] = {1,2,4,5};
		
		//1+2+4+5= 12 sum1
		//1+2+3+4+5 = 15 sum2
		//sum2-sum1=15-12=3 missing
		
		int sum1 =0;
		// we have to add the array elements
		for(int e : a) {
			sum1=sum1+e;
		}
			System.out.println(sum1);
			
		int sum2 =0;
		// now we have to sum the range of elements
		// lower range =1, upper range = 5
		for (int i=1;i<=5;i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
		int misNum=sum2-sum1;
		System.out.println("Missing number of an array is :"+misNum);
	}

}
