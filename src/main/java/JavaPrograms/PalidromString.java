package JavaPrograms;

public class PalidromString {

	public static void main(String[] args) {
		
//		String org="mom dad abc sss kadak";
//		String [] abc=org.split(" ");
//		int count=0;
//		for(int i=0;i<abc.length;i++)
//		{
//			String b=new StringBuilder(abc[i]).reverse().toString();
//			if(b.equals(abc[i]))
//			{
//				System.out.println("String is palindrome "+ abc[i]);
//				count++;
//			}
//		}
//		System.out.println("Count = "+count);
	
	String s= "mom dad aba";
	String [] abc= s.split(" ");
	int count=0;
	for(int i=0;i<abc.length;i++)
	{
		String b="";
		for(int j=abc[i].length()-1;j>=0;j--) 
		{
			b=b+abc[i].charAt(j);
		}
		if(b.equals(abc[i]))
		{
			System.out.println("String is palindrome "+ abc[i]);
			count++;
		}
	}
	System.out.println(count);
	
}}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String org="MoM";
//		String s=new StringBuilder(org).reverse().toString();
//		if(s.equals(org))
//		{
//			System.out.println("String is palindrom "+org);
//		}
//		else
//		{
//			System.out.println("String is not palindrom "+org);
//		}
		//System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		public static boolean isPalindrome(String input) {
//	        String reversed = new StringBuilder(input).reverse().toString();
//	        return input.equals(reversed);
//		
		
//		String s= "mom dad aba";
//		String [] abc= s.split(" ");
//		int count=0;
//		for(int i=0;i<abc.length;i++)
//		{
//			String b="";
//			for(int j=abc[i].length()-1;j>=0;j--) 
//			{
//				b=b+abc[i].charAt(j);
//			}
//			if(b.equals(abc[i]))
//			{
//				System.out.println("String is palindrome "+ abc[i]);
//				count++;
//			}
//		}
//		System.out.println(count);


