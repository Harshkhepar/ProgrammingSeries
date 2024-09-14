package JavaPrograms;

import javax.lang.model.element.Element;

public class LinearSearch {

	public static void main(String[] args) {
        // we have to found the element from an array
		
		int a[]= {10,20,30,40,50};
		
		int num=30;
		
		// suppose i need to found 30
		
		for (int e : a) {
		   if( e == num) {
			   
			   System.out.println("Found number in an array :"+ num);
			   break;
		   }
		   else
		   {
			   System.out.println("expected number is not found");
		   }
		   }
		}


 }
