package L2;

import java.util.Scanner;

public class SumOfAllDigits {
	
	static int findSum(int number)  
	{     
	//variable that stores the sum      
	int sum = 0;  
	//executes until the condition becomes false  
	while (number != 0)  
	{  
	//finds the last digit from the number and add it to the variable sum      
	sum = sum + number % 10;  
	//removes the last digit  
	number = number/10;  
	}  
	//returns the sum  
	return sum;  
	}  

	public static void main(String[] args) {
		long number,digit,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		number=scan.nextInt();
		/*Logic 1 using while loop
		while(number>0)
		{
			//finds the last digit of the given number    
			digit = number % 10;  
			//adds last digit to the variable sum  
			sum = sum + digit;  
			//removes the last digit from the number  
			number = number / 10;  
			} */
		
		/*//Logic 2
		for(sum=0;number!=0;number=number/10)
		{
			sum=sum+number%10;
		}*/
		
		
		
			//prints the result 
		//System.out.println("The sum of digits: "+findSum(number));  

		System.out.println("Sum of Digit="+sum);

	}

}
