package StringReletedPrograms;

import java.util.Map;
import java.util.TreeMap;

public class Temp {

	public static void main(String[] args) 
	{
		String input= "My Name is Ashwini My Name is Ashwini i am B.Tech Graduate";
	    String arr[] =input.split(" ");
	    int count=0;
	    Map<String,Object>map=new TreeMap<String,Object>();
	    for(int i=0;i<arr.length;i++)
	    {
	        //count=0;
	        for(int j=0;j<arr.length;j++)
	        {
	            if(arr[i].equals (arr[j]))
	            count++;
	        }
	        map.put(arr[i],count);
	    }
	    System.out.println(map);
	}

}
