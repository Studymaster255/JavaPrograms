package L2;

import java.util.Scanner;

public class PublicySepient3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String a=scan.next();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(b.equals(a))
		{
			System.out.println("String is palindrom");
		}else
		{
			System.out.println("String is NOT palindrom");
		}

	}

}
