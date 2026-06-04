package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the integer or press 0 to exit: ");
        int userInteger = scanner.nextInt();

        while (userInteger != 0) {

            if (userInteger < 0) {
                System.out.println("You must provide a valid number");
            } else {
                sum += userInteger;
            }

            System.out.print("Enter the integer or press 0 to exit: ");
            userInteger = scanner.nextInt();
        }

        System.out.printf("Total amount: %d%n", sum);


        scanner.close();

    }
}
