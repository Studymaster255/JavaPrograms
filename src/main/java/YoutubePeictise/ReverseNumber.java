package YoutubePeictise;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a anumber");
		int num=sc.nextInt();
		
		/*//Using algoritham
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		
		//using StringBuffer
		 StringBuffer sb=new StringBuffer(String.valueOf(num));
		 StringBuffer rev=sb.reverse();
		
		*/ 
		 StringBuilder sb=new StringBuilder();
		 sb.append(num);
		 StringBuilder rev=sb.reverse();
		System.out.println("Reverse Number is: "+ rev);
	}

}
