package L2;

public class Temp {

	public static void main(String[] args) {
		int num=153;
	     int sum=0,last=0;
	     int orgNum=num;
	     int digit=0;
	     while(num>0)
	     {
	       num=num%10;
	       digit++;
	     }
	     while(num>0)
	     {
	       last=num%10;
	       sum+=(Math.pow(last,digit));
	       num=num/10;
	     }
	     if(sum==orgNum)
	     {
	       System.out.println("AMstring");
	     }else{
	       System.out.println("Not Amstrong");
	     }

	}

}
