package YoutubePeictise;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num=10;
		long factorial=1;
		/*
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		*/
		
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		
		
		
		System.out.println(factorial);
	}

}
