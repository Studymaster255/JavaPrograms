package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepetedWorldCount {

	public static void main(String[] args) {
		String[] keywords = {"apple", "banana", "orange", "apple", "banana", "grape", "banana","abc","abc","abc"};

		Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
		for (String keyword : keywords) {
		    if (frequencyMap.containsKey(keyword)) {
		        frequencyMap.put(keyword, frequencyMap.get(keyword) + 1);
		    } else {
		        frequencyMap.put(keyword, 1);
		    }
		}

		for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
		    String keyword = entry.getKey();
		    int frequency = entry.getValue();
		    if (frequency > 1) {
		        System.out.println(keyword + " is duplicated " + frequency + " times.");
		    }
		}
		System.out.println(frequencyMap);
	}

}
