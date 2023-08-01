package JavaPrograms;

public class BuzzBizz {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,10,9,12};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0)
			{
				System.out.println(arr[i]+" =Buzz");
			}
			else if(arr[i]%5==0)
			{
				System.out.println(arr[i]+" =Fizz");
			}
		}

	}

}
