package JavaPrograms;

public class evenOddArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
         int oddNum = 0;
         int evenNum = 0;
         
         for(int e : a) {
        	 if(e%2==0) {
        		 evenNum=e;
        		 System.out.println("even num :" +evenNum);
        	 }
        	 else {
        		 oddNum=e;
        		 System.out.println("odd num :"+oddNum);
        	 }
         }
	}

}
