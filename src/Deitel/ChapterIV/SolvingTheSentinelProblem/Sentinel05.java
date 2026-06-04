package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest = 0;
        int lowest;

        System.out.print("Enter the integer or 0 to quit: ");
        int userInteger = scanner.nextInt();
        lowest = userInteger;

        while (userInteger != 0) {
            if (userInteger > highest) {
                highest = userInteger;
            }

            if (userInteger < lowest) {
                lowest = userInteger;
            }

            System.out.print("Enter the integer or 0 to quit: ");
            userInteger = scanner.nextInt();
        }

        if (highest > 0 && lowest > 0) {
            System.out.print("Highest: " + highest + "\n");
            System.out.println("Lowest: " + lowest + "\n");
        } else {
            System.out.println("Didn't provide any numbers");
        }

        scanner.close();

    }
}
