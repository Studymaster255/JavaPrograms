package JavaPrograms;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=1011;
		//convert Integer to String
		String org=Integer.toString(num);
		String s=new StringBuilder(org).reverse().toString();
		if(s.equals(org))
		{
			System.out.println("palindrom= "+num);
		}
		else {
			System.out.println("Not a palindrom="+num);
		}
	}
}
