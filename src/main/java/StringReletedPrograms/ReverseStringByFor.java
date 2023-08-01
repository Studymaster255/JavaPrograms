package StringReletedPrograms;

public class ReverseStringByFor {

	public static void main(String[] args) {
		String forReverse="it is beautiful day";
		//yad lufituaeb si ti
		
//		
//		for(int i=forReverse.length()-1;i>=0;i--)
//		{
//			System.out.print(forReverse.charAt(i));
//		}
//		
		
		//Reverse String without changing position
		//ti si ufituaeb yad
	//	System.out.println("\n<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
		String [] world=forReverse.split(" ");
		
		
		for(int j=0;j<world.length;j++)
		{
		for(int i=world[j].length()-1;i>=0;i--)
		{
			System.out.print(world[j].charAt(i));
		}
		System.out.print(" ");
		}
		
	}

}
