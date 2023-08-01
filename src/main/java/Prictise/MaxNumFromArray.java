package Prictise;

public class MaxNumFromArray {

	public static void main(String[] args) {
		int [] a= {534,97,567,123,98};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
