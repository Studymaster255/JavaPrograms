package YoutubePeictise;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		
		if(org_num==rev)
		{
			System.out.println(org_num+" is a palindrom number: ");
		}
		else
		{
			System.out.println(org_num+" is not a palindrom number: ");
		}
		//System.out.println("Reverse Of number: "+rev);
	}

}
