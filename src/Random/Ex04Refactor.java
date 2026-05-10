package Random;

import java.util.Scanner;

public class Ex04Refactor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuOptions = 0;

        while (menuOptions != 4) {
            int inputNumber;
            System.out.printf("%s%n%s%n%s%n%s%n", "1 - Check if the number is even or odd", "2 - Check if the number is positive, negative or zero", "3 - Calculate its factorial", "4 - Exit");
            menuOptions = scanner.nextInt();

            switch (menuOptions) {

                case 1: {
                    System.out.print("Integer: ");
                    inputNumber = scanner.nextInt();
                    if (inputNumber % 2 > 0) {
                        System.out.println("Odd integer");
                    } else {
                        System.out.println("Even integer");
                    }
                }
                break;

                case 2: {
                    System.out.print("Integer: ");
                    inputNumber = scanner.nextInt();
                    if (inputNumber < 0) {
                        System.out.println("Negative integer");
                    } else if (inputNumber > 0) {
                        System.out.println("Positive integer");
                    } else {
                        System.out.println("Integer is zero");
                    }
                }
                break;

                case 3: {
                    System.out.print("Integer: ");
                    inputNumber = scanner.nextInt();
                    int factorial = 1;

                    for (int i = 1; i <= inputNumber; i++) {
                        factorial *= i;
                    }

                    System.out.println("Factorial: " + factorial);
                }
                break;
                case 4:
                    System.out.println("Leaving.....");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
