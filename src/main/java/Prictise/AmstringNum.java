package Prictise;

public class AmstringNum {

	public static void main(String[] args) {
		int num=153;
		int orgNum=num;
		int result=0;
		int n=String.valueOf(num).length();
		System.out.println(n);
		while(num !=0)
		{
			int digit = num%10;
			result += Math.pow(digit, n);
			num /= 10;
		}
		if(result==orgNum)
		{
			System.out.println("Number is amstring");
		}
		else
		{
			System.out.println("Number is not amstrong");
		}
	}

}
