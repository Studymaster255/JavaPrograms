package YoutubePeictise;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,4,8,6};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Element in array= "+max);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Element in array= "+min);
	}

}
