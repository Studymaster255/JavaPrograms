package L2;

public class SecoundLargestFromArrayAssending {

	public static void main(String[] args) {
		int [] arr= {8,2,5,9,3,1,11};
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
		System.out.println("Secound Largest="+arr[size-2]);
		for(int a:arr)
		{
			System.out.println(a);
		}

	}

}
