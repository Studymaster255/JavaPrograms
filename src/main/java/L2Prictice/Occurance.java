package L2Prictice;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		String a="swapnil";
		char[] arr=a.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			char b=arr[i];
			
			if(map.containsKey(b))
			{
				
				map.put(b, map.get(b)+1);
			}else
			{
				map.put(b, 1);
			}
		}
		System.out.println(map);
	}

}
