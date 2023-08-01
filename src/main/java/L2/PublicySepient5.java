package L2;

import java.util.ArrayList;
import java.util.List;

public class PublicySepient5 {

	public static List<Character> findRepeatedConsecutiveChars(String input) {
        List<Character> repeatedChars = new ArrayList<>();
        
        if (input == null || input.length() < 2) {
            return repeatedChars; // No repeated consecutive characters possible
        }
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1) && !repeatedChars.contains(input.charAt(i))) {
                repeatedChars.add(input.charAt(i));
            }
        }
        
        return repeatedChars;
    }
	public static void main(String[] args) {
		String input = "geeksforgeekss";
        List<Character> repeatedChars = findRepeatedConsecutiveChars(input);
        System.out.println("Repeated consecutive characters: " + repeatedChars);

	}

}
