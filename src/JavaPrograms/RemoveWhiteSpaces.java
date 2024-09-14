package JavaPrograms;

import java.util.Arrays;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		
		String str = "java       selenium       programming      language";
		
		System.out.println("String before removing spaces :" +str);
	    str= str.replaceAll("\\s", "");
		
	    System.out.println("String after removing spaces :" +str);
	}
}
