package L2;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int num=60;
		int factor=0;
		List al=new ArrayList();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				al.add(i);
				factor++;
			}
		}
		System.out.println();
		System.out.println("Total factors is="+factor);
		System.out.println(al);

	}

}
