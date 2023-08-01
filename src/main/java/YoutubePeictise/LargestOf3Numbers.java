package YoutubePeictise;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Num:");
		int a=sc.nextInt();
		
		System.out.println("Enter Secound Num:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Num:");
		int c=sc.nextInt();
		
		/*
		//Logic 1
		if((a>b)&&(a>c))
		{
			System.out.println(a+" is the largest number among three");
		}else if((b>c)&&(b>a))
		{
			System.out.println(b+" is the largest number among three");
		}else 
		{
			System.out.println(c+" is the largest number among three");
		}
		
		
		//Logic 2 using Ternary Operator
		int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;
		System.out.println(largest2+" is largest number");
		*/
		//Logic 3 combing two statement
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+" is largest number");

	}

}
