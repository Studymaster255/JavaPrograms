package L2Prictice;

public class ReverseString {

	public static void main(String[] args) {
		String s="swapnil";
		String b="";
		for(int i=s.length()-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		System.out.println(b);

	}

}
