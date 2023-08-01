package YoutubePeictise;

public class ReverseString {

	public static void main(String[] args) {
		//Logic 1 using concatanitation Operator
		String str="abcd";
		//String rev="";
		/*
		int len=str.length();//4
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		//Using char Array
		char[] a=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}*/
		
		//StringBuffer Class
		StringBuffer sb=new StringBuffer(str);
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse of String="+ rev);

	}

}
