package Random;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] even = new int[6];
        int[] odd = new int[6];
        int evenCount = 0;
        int oddCount = 0;
        int evenOrOdd = 0;

        System.out.print("Enter the first integer or 0 to skip: ");
        int firstNumber = scanner.nextInt();

        while (firstNumber != 0) {
            System.out.print("Enter the second integer (greater than the first one): ");
            int secondNumber = scanner.nextInt();

            try {
                if (firstNumber % 2 == 0) {
                    even[evenCount] = firstNumber;
                    evenCount++;
                }

                if (firstNumber % 2 > 0) {
                    odd[oddCount] = firstNumber;
                    oddCount++;
                }

                if (secondNumber % 2 == 0) {
                    even[evenCount] = secondNumber;
                    evenCount++;
                }

                if (secondNumber % 2 > 0) {
                    odd[oddCount] = secondNumber;
                    oddCount++;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Max integer reached!");
                break;
            }

            System.out.print("Enter the first integer or 0 to skip: ");
            firstNumber = scanner.nextInt();

        }

        if (evenCount > 0 && oddCount > 0) {

            System.out.println("1: Even or 2: Odd");
            evenOrOdd = scanner.nextInt();

            if (evenOrOdd == 1) {
                Arrays.stream(even)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .forEach(System.out::println);
            } else {
                Arrays.stream(odd)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .forEach(System.out::println);
            }

        }

        scanner.close();
    }

}





