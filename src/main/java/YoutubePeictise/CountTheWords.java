package YoutubePeictise;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string=");
//		String str=sc.next();
		String str="my name is swapnil and i am working in coforge";
		int count=0;
		System.out.println();
		String arr[]=str.split(" ");
		for(String v:arr)
		{
			System.out.println(v);
			count++;
		}
		System.out.println(count);
	}

}
