package L2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Number: ");
		double num1=scan.nextDouble();
		System.out.println("Enter Scecound Number: ");
		double num2=scan.nextDouble();
		System.out.println("Enter Operator = + - * / ");
		char operator=scan.next().charAt(0);
		double result=0;
		switch(operator){
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
			default:
				System.out.println("provide proper operator");
		}
		System.out.println(result);
		
		

	}

}
