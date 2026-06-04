package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 1;
        int count = 0;

        System.out.print("Enter the integer (0 to quit): ");
        int userHasEntered = scanner.nextInt();

        while (userHasEntered != 0) {
            product = userHasEntered * product;
            count++;

            System.out.print("Enter the integer (0 to quit): ");
            userHasEntered = scanner.nextInt();
        }

        if (count > 0) {
            System.out.println("Product: " + product);
        } else {
            System.out.println("Application closed");
        }

        scanner.close();

    }
}
