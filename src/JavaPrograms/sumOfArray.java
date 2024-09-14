package JavaPrograms;

public class sumOfArray {
	
	public static void main(String[] args) {
       int a[]= {5,2,7,9,6};
       int sum = 0;
       
       int len = a.length;
    		   
//       for(int i=0;i<=len-1;i++) {
//    	   sum=sum+a[i];
//    	   
//       }
       
       for(int value : a) {
    	   sum=sum+value;
       }
       System.out.println(sum);
	}
}
