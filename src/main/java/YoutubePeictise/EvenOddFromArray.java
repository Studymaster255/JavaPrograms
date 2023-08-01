package YoutubePeictise;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,8};
		
		System.out.println("Even numbers form Array:");
		/*for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}*/
		for(int eve:arr)
		{
			if(eve%2==0)
				System.out.println(eve);
		}
		
		
		
		System.out.println("Odd numbers form Array:");
		/*for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
				System.out.println(arr[i]);
		}*/
		for(int eve:arr)
		{
			if(eve%2!=0)
				System.out.println(eve);
		}

	}

}
