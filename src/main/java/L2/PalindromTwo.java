package L2;

import java.util.Scanner;

public class PalindromTwo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String: ");
		String a=scan.nextLine();
		StringBuffer sb=new StringBuffer(a);
		StringBuffer reverse=sb.reverse();
		String b=reverse.toString();
		if(b.equals(a))
		{
			System.out.println(a+" String is palindrom");
		}else
		{
			System.out.println(a+" String is NOT palindrom");
		}
	//System.out.println(reverse);	

	}

}
