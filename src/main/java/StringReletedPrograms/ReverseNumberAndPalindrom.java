package StringReletedPrograms;

public class ReverseNumberAndPalindrom {

	public static void main(String[] args) {
		long mob=888898888;
		String mobile=Long.toString(mob);
		//To reverse the number
		String rev=new StringBuilder(mobile).reverse().toString();
		System.out.println("Reverse of number="+rev);
		if(rev.equals(mobile))
		{
			System.out.println("palindrom :"+rev);
		}
		else
		{
			System.out.println("Not Palindrom :"+mobile);
		}
	}
}
