package YoutubePeictise;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int search_ele=50;
		boolean flag=false;
		for(int v:arr)
		{
			if(search_ele==v)
			{
				System.out.println("Element found= "+v);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element is not found");
		}
	}

}
