package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CountDublicateCharactorInString {
	/**
	 * Identify dublicates keywords and how many times this keyword is dublicated
	 * @param args
	 */
	public static void main(String[] args) {
		String a="akkshaygayakawad";//a,k,y
        char[] words =new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            words[i] = a.charAt(i);
        }
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character abc : words) 
		{
			if (map.containsKey(abc)) 
			{
				map.put(abc,  (int) (map.get(abc) + 1));
			} 
			else 
			{
				map.put(abc, (int) 1);
			}
		}
		Set<Character> ls = map.keySet();
		for (Character pqr : ls) 
		{
			if (map.get(pqr) >1) 
			{
				System.out.println(pqr + " : " + map.get(pqr));
			}
		}
	}
	}




