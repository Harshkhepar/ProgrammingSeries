package JavaPrograms;

import java.util.Arrays;

public class checkArraysEquals {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int a1[] = {1,2,3,4,5,6};
	//Approach 1:	
		/*Boolean status = Arrays.equals(a1, a);
		
		if(status==true) {
			
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
     */
		
		//Approach 2:
		boolean status = true;
		
			if(a.length== a1.length) {
				for(int i=0;i<=a.length-1;i++) {
					if(a[i]!= a1[i]) {
						status=false;
					}
				}
				
			}
			else {
				status = false;
			}
			if(status==true)
			{
				System.out.println("Arrays are equal");
			}
			else
			{
				System.out.println("Arrays are not equal");
			}
		
		
	}

}
