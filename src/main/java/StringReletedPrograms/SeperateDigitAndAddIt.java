package StringReletedPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeperateDigitAndAddIt {

	public static void main(String[] args) {
		String input = "t58hi4s";
		StringBuffer number=new StringBuffer();
		List<Object> ll=new ArrayList<Object>();
		char [] arr=input.toCharArray();
		StringBuffer str=new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
        	if(Character.isDigit(arr[i])&&Character.isDigit(arr[i+1]))
            	{
            		str.append(arr[i]);
            		str.append(arr[i+1]);
            		ll.add(str);
            	}
        	else if (Character.isDigit(arr[i]))
        	{
        		ll.add(arr[i]);
        	}
//        	else
//        	{
//        		System.out.print(arr[i]);
//        	}
        }
        System.out.println();
       // System.out.println(number);
        Iterator itr=ll.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
	}
}
        
        
       

	
    


