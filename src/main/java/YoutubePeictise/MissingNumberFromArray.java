package YoutubePeictise;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		//Array should not have duplicates
		//Array no need to be sorted order
		//value should be in range
		int a[]= {11,12,13,14,15,17,18};
		int sum=0;
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of element in array: "+sum);
		int sum2=0;
		for(int i=a[0];i<=a[a.length-1];i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of element in array: "+sum2);
		System.out.println("Missing Number= "+(sum2-sum));
	}
}
