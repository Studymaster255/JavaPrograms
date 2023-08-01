package L2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharactor {

	public static void main(String[] args) {
		String a="aabbbbc";
		char[]arr=a.toCharArray();
		Map<Character,Integer> map=new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])) {
				int count=map.get(arr[i]);
				map.put(arr[i], count+1);
			}else
			{
				map.put(arr[i], 1);
			}
		}
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry mm=(Map.Entry)itr.next();
			Object o=mm.getValue();
			int n=(int)o;
			if(n>=2)
			{
				System.out.println(mm.getKey()+" : "+ mm.getValue());
			}
//			System.out.println(mm.getKey());
//			System.out.println(mm.getValue());
		}
		//System.out.println(map);

	}

}
