package L2;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=1331;
		int orgNum=num;
		int rev=0;
		
		while(num!=0)
		{
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		System.out.println(rev);
		if(orgNum==rev)
		{
			System.out.println(orgNum+" is a palindrom");
		}else
		{
			System.out.println(orgNum+" is not a palindrom");

		}
	}

}
