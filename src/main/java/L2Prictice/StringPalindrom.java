package L2Prictice;

public class StringPalindrom {

	public static void main(String[] args) {
		String a="mama";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equals(b))
		{
			System.out.println("Palindrom");
		}else
		{
			System.out.println("Not palindrom");
		}
	}

}
