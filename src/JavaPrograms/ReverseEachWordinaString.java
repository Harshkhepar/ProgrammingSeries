package JavaPrograms;

public class ReverseEachWordinaString {

	public static void main(String[] args) {
      String str = "Welcome To Java";// Orignal String
      
      // first we have to split it in multiple parts

      String[] words = str.split(" ");
      
      String reverseString ="";
      
      for( String w :words)// Welcome // To  //java
      {
    	  
    	  String reverseWord = "";
    	  
    	  for(int i=w.length()-1;i>=0;i--) // Welcome
    	  {
    		  
    		  reverseWord=reverseWord+w.charAt(i);
    	  }
    	  
    	  reverseString=reverseString+reverseWord+" ";// emocleW //oT //avaJ
      }
      
      System.out.println(reverseString);
      
      
      //Approach 2
      String s = "Welcome To Selenium";// Orignal String
      
      String[] words1 = s.split(" ");
      
      String reverseWord1 = "";
      
      String reverseString1 ="";
     
    for( String w :words1)
     {
    	 StringBuilder sb = new StringBuilder(w);
    	 StringBuilder str1= sb.reverse();
    	 reverseWord1=reverseWord1+str1+ " ";
    	 reverseString1=reverseWord1;
     }
    System.out.println(reverseString1);
   
	}

}
