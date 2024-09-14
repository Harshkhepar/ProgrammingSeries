package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {

      // Approach 1
		/**int a[]= {10,30,80,100,60};
		
		System.out.println("Array before sorting :" +Arrays.toString(a));
		// use method in Arrays class : Arrays.parallelSort()		
		Arrays.parallelSort(a);		
		System.out.println("Array after sorting :" +Arrays.toString(a));**/
		
		// Approach2
		int a[]= {10,30,80,100,60};
		System.out.println("Array before sorting :" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting :" +Arrays.toString(a));
		
		// sort the elements in reverse order means in descending orders
		Integer a1[]= {10,30,80,100,60};
		System.out.println("Array before sorting :" +Arrays.toString(a1));
		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println("Array after sorting :" +Arrays.toString(a1));
		
	}

}
