package YoutubePeictise;

public class CheckArrayEquals {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,6};
		//Approach 1
		//boolean status=Arrays.equals(arr1, arr2);
		//System.out.println(status);
		//Approach 2
		boolean status=true;
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i] != arr2[i])
				status=false;
			}
			
		}else
		{
			status=false;
		}
		System.out.println(status);
	}
	
}
