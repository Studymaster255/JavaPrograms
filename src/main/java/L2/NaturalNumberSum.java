package L2;

public class NaturalNumberSum {

	public static void main(String[] args) {
		int num=10,sum=0;
//		for(int i=0;i<=num;i++)
//		{
//			sum=sum+i;
//		}
		int k=1;
		while(k<=num)
		{
			sum=sum+k;
			k++;
		}
		System.out.println("Sum of Natural number upto "+num+" is= "+sum);
	}

}
