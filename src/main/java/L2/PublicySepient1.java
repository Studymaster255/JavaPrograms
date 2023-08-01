package L2;

import java.util.Scanner;

public class PublicySepient1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array=");
		int size=scan.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter First numbers=");
		int num1=scan.nextInt();
		System.out.println("Enter 2 numbers=");
		int num2=scan.nextInt();
		System.out.println("Enter 3 numbers=");
		int num3=scan.nextInt();
		System.out.println("Enter 4 numbers=");
		int num4=scan.nextInt();
		System.out.println("Enter 5 numbers=");
		int num5=scan.nextInt();
		System.out.println("Enter 6 numbers=");
		int num6=scan.nextInt();
		
		arr[0]=num1;
		arr[1]=num2;
		arr[2]=num3;
		arr[3]=num4;
		arr[4]=num5;
		arr[5]=num6;
		System.out.println("output below");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}


