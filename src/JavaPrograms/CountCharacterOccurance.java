  package JavaPrograms;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s ="Java programming java OOPS";

		int totalCount = s.length();// total len
		
//		int totalCountAfterRemove= s.replaceAll("a", "").length();// total length after removing all 'a'
		int totalCountAfterRemove= s.replaceAll("J", "").length();
		int count = totalCount-totalCountAfterRemove;
		
		System.out.println(count);
	}

}
