package JavaPrograms;

import java.util.Scanner;

public class AmstringNumberChatBaba {

	public static void main(String[] args) {
		int num, originalNum, remainder, result = 0, n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		num = sc.nextInt();
		originalNum = num;

		// Find the number of digits in the given number
		while (originalNum != 0) {
			originalNum /= 10;
			++n;
		}

		originalNum = num;

		// Calculate the result
		while (originalNum != 0) {
			remainder = originalNum % 10;
			result += Math.pow(remainder, n);
			originalNum /= 10;
		}

		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
	}

}


