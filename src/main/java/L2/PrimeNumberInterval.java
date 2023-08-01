package L2;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberInterval {

	public static void main(String[] args) {
		int num1=1;
		int num2=100;
		int num=0;
		List al=new ArrayList();
		List nonprimeal=new ArrayList();
		for(int i=num1;i<=num2;i++)
		{
			int count=0;
			num=i;
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				count++;
			}
			if(count==2)
			{
				al.add(num);
			}else
			{
				nonprimeal.add(num);
			}
			}
		System.out.println(al);
		System.out.println(nonprimeal);
		}
	}


