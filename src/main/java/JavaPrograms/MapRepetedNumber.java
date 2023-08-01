package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRepetedNumber {
/**
 * Program pending
 * @param args
 */
	public static void main(String[] args) {
int[] words = { 10, 20,30,20, 30,20, 20, 40, 30};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (Integer abc : words) 
		{
			if (map.containsKey(abc)) 
			{
				map.put(abc, map.get(abc) + 1);
			} 
			else 
			{
				map.put(abc, 1);
			}
		}
		Set<Integer> ls = map.keySet();
		for (Integer pqr : ls) 
		{
			if (map.get(pqr) > 1) 
			{
				System.out.println(pqr + " : " + map.get(pqr));
				//System.out.println(pqr+""+map.get(pqr));
			}
		}
	}
}
