package YoutubePeictise;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Number: ");
		    int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(num+" Number is prime");
			}else
			{
				System.out.println("Number is not prime and factors="+count);
			}
		}else
		{
			System.out.println("Number is not prime");
		}
	}

}
