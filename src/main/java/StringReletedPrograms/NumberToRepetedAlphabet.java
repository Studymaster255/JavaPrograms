package StringReletedPrograms;

public class NumberToRepetedAlphabet {

	public static void main(String[] args) {
		String str="Hello World";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{			
			if(str.charAt(i)=='l')
			{
			    count++;//1 2 3
		    	System.out.print(count);
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
