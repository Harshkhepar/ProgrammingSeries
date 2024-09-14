package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//Logic 1 : using string concatenation(+)operator

		String str = "ABCD";
		String rev = "";	
		
//		int len = str.length();//4
//		
//		for (int i = len-1;i>=0;i--) {//3
//			rev = rev + str.charAt(i);// D  DC  DCB DCBA
//		}
//		System.out.println(rev);
		
		//Logic 2 : Using character array
		
//		char a[]= str.toCharArray();
//		int len = a.length;
//		
//		for (int i=len-1;i>=0;i--) {
//			rev=rev+a[i];
//		}
//		System.out.println(rev);
		
		//Logic 3 : using StringBuffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
