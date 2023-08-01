package L2;

import java.util.ArrayList;
import java.util.List;

public class SeperatePrime {

	public static void main(String[] args) {
		int arr[]={25,35,65,45,75,41,84,26,954,41,31};
		List primeal=new ArrayList();
		List nonprimeal=new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int count=0;
			if(num>1)
			{
				for(int j=1;j<=num;j++)
				{
					if(num%j==0)
						count++;
				}
				if(count==2)
				{
					//System.out.println(num+" Number is prime");
					primeal.add(num);
				}else
				{
					//System.out.println("Number is not prime and factors of "+num+" ="+count);
					nonprimeal.add(num);
				}
			}else
			{
				System.out.println("Number is not prime");
			}
		}
		System.out.println("Prime "+primeal);
		System.out.println("Non prome "+nonprimeal);
	}

}
