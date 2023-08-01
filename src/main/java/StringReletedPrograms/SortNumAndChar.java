package StringReletedPrograms;

public class SortNumAndChar {

	public static void main(String[] args) {
		String a="Sainath123!@#$%";
		char [] arr=a.toCharArray();
		String alphabets=" ";
		String num=" ";
		String symbol1=" ";
		for(int i=0;i<arr.length;i++)
		{
			char alpha=arr[i];
			if(Character.isAlphabetic(alpha))
			{
				alphabets+=alpha;
			}
			else if(Character.isDigit(alpha))
			{
				num+=alpha;
			}
			else 
			{
				symbol1+=arr[i];
			}
		}
		System.out.println("alphabets="+alphabets);
		System.out.println("Integers="+num);
		System.out.println("===========");
		System.out.println("Symbols="+symbol1);
	}
}
