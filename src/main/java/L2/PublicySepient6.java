package L2;

public class PublicySepient6 {

	public static void main(String[] args) {
		int arr[]= {12,35,1,10,34,1};
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
		System.out.println(arr[0]+" AND "+arr[size-1]);
		

	}

}
