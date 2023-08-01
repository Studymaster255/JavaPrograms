package StringReletedPrograms;

public class MaxNumFromArray {

	public static void main(String[] args) {
		int a[]= {10,1,123,1233,54,5,32,0};
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
