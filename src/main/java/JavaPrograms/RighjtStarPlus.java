package JavaPrograms;

public class RighjtStarPlus {
	public static void main(String[] args) {
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}else
				{
					System.out.print("+");
				}
			}
			System.out.println(" ");
		}
		System.out.println("----------------------");
		
		for(int i=0;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}else
				{
					System.out.print("+");
				}
			}
			System.out.println(" ");
		}
	}
	

}
