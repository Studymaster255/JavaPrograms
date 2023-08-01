package L2;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		int num=12341;
		int digit=0;
		
		while(num!=0)
		{
			num=num/10;
			digit++;
		}
		System.out.println(digit);
	}

}
