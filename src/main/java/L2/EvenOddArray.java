package L2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenOddArray {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int[] array1={10,3,7,2,4,9,12,16,19,200,201};
		int[] array2={15,12,6,65,98,78,67,55};
		
		List even=new ArrayList();
		List odd=new ArrayList();
		
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]%2==0)
			{
				even.add(array1[i]);
			}else 
			{
				odd.add(array1[i]);
			}
		}
		for(int i=0;i<array2.length;i++)
		{
			if(array1[i]%2==0)
			{
				even.add(array2[i]);
			}else 
			{
				odd.add(array2[i]);
			}
		}
		
		Collections.sort(even);
		Collections.sort(odd);
		System.out.println(even);
		System.out.println(odd);
		
	}

}
