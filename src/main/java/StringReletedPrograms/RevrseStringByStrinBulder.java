package StringReletedPrograms;

public class RevrseStringByStrinBulder {
	public static void main(String[] args) {
		String forReverse="mera bharat mahan hai mahan rahega mahan tha";
		
		//just reverse whole string
		StringBuilder reversedName=new StringBuilder(forReverse).reverse();
		System.out.print(reversedName);
		
		System.out.println("\n<<<<<<<<<<<<>>>>>>>>>>>>>>\n");
		String [] splitName=forReverse.split(" ");
		
		
		for(int i=1;i<splitName.length;i++)
		{
			System.out.print(new StringBuilder(splitName[i]).reverse());
			System.out.print(" ");
		}
		System.out.println("\n<<<<<<<<<<<< ODD EVEN >>>>>>>>>>>>>>\n");
		//odd words are reversed and even at same place 
		for(int i=0;i<splitName.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(new StringBuilder(splitName[i]).reverse());
				System.out.print(" ");
			}else
			{
				System.out.print(splitName[i]+" ");
			}
		}
	}
}
