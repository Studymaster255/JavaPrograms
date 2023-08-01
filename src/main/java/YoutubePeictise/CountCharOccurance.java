package YoutubePeictise;

public class CountCharOccurance {

	public static void main(String[] args) {
		String s="Java Programming java oops";
		int totalCount=s.length();
		
		int totalcount_afterRemove=s.replaceAll("a", "").length();
		int count=totalCount-totalcount_afterRemove;
		System.out.println("Number of occurance of a="+count);
	}

}
