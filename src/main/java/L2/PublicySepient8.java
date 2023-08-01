package L2;

public class PublicySepient8 {

	public static void main(String[] args) {
		int [] arr= {1,2,6,4,3,8,7};
		int sum=0;
		int size=arr.length,temp;
		for(int i=0;i<size;i++)
		{
			
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int value:arr)
		{
			sum=sum+value;
		}
		int one=arr[0];
		int last=arr[size-1];
		int sum2=0;
		for(int k=one;k<=last;k++)
		{
				sum2=sum2+k;
		}
//		System.out.println(sum);
//		System.out.println(sum2);
		System.out.println(sum2-sum);
	}
}
