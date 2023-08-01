package L2;

public class PrimeNumber {
//Wrong Logic
	public static void main(String[] args) {
		int num=25;
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Number is prime");
		}else
		{
			System.out.println("Number is not a prime");
		}
	}

}
