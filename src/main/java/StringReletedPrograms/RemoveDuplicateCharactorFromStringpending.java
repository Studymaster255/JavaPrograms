package StringReletedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateCharactorFromStringpending {

	public static void main(String[] args) {
		 String input = "deepeepps";
	     char [] arr=input.toCharArray();
	     
//	     List list=new ArrayList();
//	     
//	     list=Arrays.asList(arr);
	     
	     HashSet nonDup=new HashSet();
	     
	     for(int i=0;i<arr.length;i++)
	     {
	    	 nonDup.add(arr[i]);
	     }
	     
	     Iterator itr=nonDup.iterator();
	     while(itr.hasNext())
	     {
	    	 System.out.print(itr.next().toString());
	     } 
	}
}

	


