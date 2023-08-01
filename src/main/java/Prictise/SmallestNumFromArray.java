package Prictise;

public class SmallestNumFromArray {

	public static void main(String[] args) {
		int [] a= {534,987,567,123,987};
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
