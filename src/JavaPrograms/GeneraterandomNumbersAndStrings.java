package JavaPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GeneraterandomNumbersAndStrings {

	public static void main(String[] args) {
		// Approach 1 : using random class of java
		
		Random rand = new Random();
		int rand_int = rand.nextInt(100);// give any number between 0 to 99
		System.out.println(rand_int);
		
		double rand_dbl=rand.nextDouble();// range is 0.0 to 1.0
		System.out.println(rand_dbl);
		
		//Approach 2 : using Math class of java --> by default we can generate only decimel value
		System.out.println(Math.random());
		
		//Approach 3: using Apache commons-lang API
		
		String randNum = RandomStringUtils.randomNumeric(5);
		System.out.println(randNum);
		
		String randStr= RandomStringUtils.randomAlphabetic(5);
		System.out.println(randStr);

	}

}
