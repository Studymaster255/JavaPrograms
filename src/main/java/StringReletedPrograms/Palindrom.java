package StringReletedPrograms;

public class Palindrom {

	public static void main(String[] args) {
		String words="bharat maham tha maham hai maham rahega";
		
		String [] wordarray=words.split(" ");
		
		for(int i=0;i<wordarray.length;i++)
		{
		String reverse=new StringBuilder(wordarray[i]).reverse().toString();
		
		if(reverse.equals(wordarray[i]))
		{
			System.out.println("palindrom :"+reverse);
		}
		else
		{
			System.out.println("Not palindrom :"+wordarray[i]);
		}
		}
	}}
