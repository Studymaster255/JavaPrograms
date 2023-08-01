package L2;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number=371, orgNum,reminder,result=0;
		
		orgNum=number;
		
		while(orgNum!=0)
		{
			reminder=orgNum%10;
			result+= Math.pow(reminder, 3);
			orgNum/=10;
		}
		
		if(result==number)
		{
			System.out.println("Number is Amstring Number");
		}else
		{
			System.out.println("Number is not Amstring");
		}
	}

}
