package L2Prictice;

public class IntArraySortingSmallestAndLargest {

	public static void main(String[] args) {
		int arr[]= {1,3,5,7,9,3,2};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("Largest no="+arr[arr.length-2]);

	}

}
