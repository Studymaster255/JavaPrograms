package L2;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		//String a="mom";
		Scanner scan=new Scanner(System.in);
		System.out.println("Write String:");
		String a=scan.nextLine();
	     String b="";
	     char [] arr=a.toCharArray();
	     for(int i=a.length()-1;i>=0;i--)
	     {
	    	 b=b+a.charAt(i);
	     }
	     if(a.equals(b))
	     {
	    	 System.out.println(a+" String is palindrom");
	     }else
	     {
	    	 System.out.println(a+" String is not palindrom");
	     }
	  }
	}


