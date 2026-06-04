package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMultiples = 0;

        System.out.print("Enter the integer or -1 to quit: ");
        int userInput = scanner.nextInt();

        while (userInput != -1) {

            if (userInput % 3 == 0) {
                totalMultiples += userInput;
            }

            System.out.print("Enter the integer or -1 to quit: ");
            userInput = scanner.nextInt();
        }

            System.out.println("Multiples of 3 sum: " + totalMultiples);

        scanner.close();

    }
}
