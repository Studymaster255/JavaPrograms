package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class EvenOddArray {

	public static void main(String[] args) {
		
		int[] ar1={10,3,7,2,4,9,12,16,19,200,201};
		int[] ar2={15,12,6,1,65,98,78,67,55};
		List l1=new ArrayList();
		List l2=new ArrayList();
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]%2==0)
			{
				l1.add(ar1[i]);
			}else if(ar1[i]%2==1)
			{
				l2.add(ar1[i]);	
			}
		}
		for(int i=0;i<ar2.length;i++)
		{
			if(ar2[i]%2==0)
			{
				l1.add(ar2[i]);
			}else if(ar2[i]%2==1)
			{
				l2.add(ar2[i]);	
			}
		}
		System.out.println("Even numbers= "+l1);
		System.out.println("Odd Numbers= "+l2);
	}
}
