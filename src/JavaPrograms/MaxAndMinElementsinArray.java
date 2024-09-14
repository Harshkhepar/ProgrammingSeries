package JavaPrograms;

public class MaxAndMinElementsinArray {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};
		
		//Assume
		int max =a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max =a[i];
			}
		}
		System.out.println("Maximum number in an array is :"+max);
		
		
		// for min num
		
        int min =a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min =a[i];
			}
		}
		System.out.println("Minimum number in an array is :"+min);
	}

}
