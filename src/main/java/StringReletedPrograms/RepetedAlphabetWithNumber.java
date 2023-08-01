package StringReletedPrograms;

public class RepetedAlphabetWithNumber {

	public static void main(String[] args) {
		String a="Hello World ";
		int counter=1; 
		StringBuilder word=new StringBuilder(); 
		String abc="";
		char [] arr=a.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=(arr[j]))
				{
					word.append(arr[i]);
					break;
				} 
				else if(arr[i]==(arr[j]))
				{
					counter++;
					word.append(counter);
					break;
				}
			}	
		}
		System.out.print(word);
	}
}
