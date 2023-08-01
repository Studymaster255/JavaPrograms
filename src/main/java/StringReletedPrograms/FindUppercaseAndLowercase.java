package StringReletedPrograms;

public class FindUppercaseAndLowercase {

	public static void main(String[] args) {
		String word="mera BHArat maHan";
				
		String upperCase="";
		String lowerCase="";
		char [] arr=word.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char alpha=arr[i];
			if(Character.isUpperCase(alpha))
			{
				upperCase+=arr[i]+" ";//uppercase=uppercase+arr[i];
			}
			else if(Character.isLowerCase(alpha))
			{
				lowerCase+=arr[i]+" ";
			}
		}
		System.out.println(upperCase);
		System.out.println(lowerCase);
	}
}
