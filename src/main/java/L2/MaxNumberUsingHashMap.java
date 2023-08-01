package L2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxNumberUsingHashMap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> numbersMap = new HashMap<>();

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbersMap.put(i, number);
        }

        int largestNumber = findLargestNumber(numbersMap);
        System.out.println("The largest number is: " + largestNumber);
    }

    public static int findLargestNumber(Map<Integer, Integer> numbersMap) {
        int largestNumber = Integer.MIN_VALUE;

        for (int number : numbersMap.values()) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        return largestNumber;

	}

}
