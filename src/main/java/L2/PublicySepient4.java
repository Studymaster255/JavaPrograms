package L2;

import java.util.Scanner;

public class PublicySepient4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scan.nextInt();
		int b=num;
		int rev=0;
		while(num>0)
		{
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		if(b==rev)
		{
			System.out.println("palindrom");
		}else
		{
			System.out.println("NOT palindrom");
		}

	}

}
