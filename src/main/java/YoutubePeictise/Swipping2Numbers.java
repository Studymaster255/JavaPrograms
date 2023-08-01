package YoutubePeictise;

import java.util.Scanner;

public class Swipping2Numbers {

	public static void main(String[] args) {
		//int a=11,b=20;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Num:");
		int a=scan.nextInt();
		
		System.out.println("Enter Secound Num:");
		int b=scan.nextInt();
		
		System.out.println("Before swipping values are.."+a+" "+b);
		
		/*//Logic 1 Third variable
		int t=a;	//10
		a=b;		//20
		b=t;		//10
		*/
		
		/*
		//Logic 2 use + and - without using third variable
		a=a+b;	//10+20=30
		b=a-b;	//30-20=10
		a=a-b;	//30-10=20
		*/
		
		/*
		//Logic 3 using * and / without using third variable
		// a & b values should not be zero
		a=a*b;	//10*20=200
		b=a/b;	//200/20=10
		a=a/b;	//200/10=20
		*/
		
		/*
		//logic 4 using bitwise XOR(^)
		a=a^b;
		b=a^b;
		a=a^b;
		*/
		
		//Logic 5 By using BODMOS
		b=a+b-(a=b);
		
		System.out.println("After swipping values are.."+a+" "+b);
		
		
		
		
	}

}
