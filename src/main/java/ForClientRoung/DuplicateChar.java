package ForClientRoung;

import java.util.HashMap;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "abcdedartfgab";
        HashMap <Character, Integer> hMap = new HashMap<Character, Integer>();
        for (int i = 0; i <str.length(); i++) {
           if (hMap.containsKey(str.charAt(i))) {
              int count = hMap.get(str.charAt(i));
              hMap.put(str.charAt(i), ++count);
           } else {
              hMap.put(str.charAt(i),1);
           }
        }
        System.out.println(hMap);   

	}

}
