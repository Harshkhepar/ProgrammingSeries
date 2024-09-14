package JavaPrograms;

public class CountTheWords {

	public static void main(String[] args) {
             String s = "Welcome To Java";
             
             int count =1;
             
            // condition or approach
           //  s.charAt(i)==' '-- ye btara hai k space b include krna hai  && s.charAt(i+1)!=' '--- ye btata space k alawa b  
             // include krna hai
             
             for(int i =0;i<s.length()-1;i++) {
             if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
            	 count++;
             }
             }
             System.out.println("Number of words in a String"+count);
	}

}
