package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pairsCount = 0;

        System.out.println("Enter the integer or -1 to quit: ");
        int userInput = scanner.nextInt();

        while (userInput != -1) {
            if (userInput %  2 == 0) {
                pairsCount++;
            }

            System.out.println("Enter the wished integer or press -1 to quit: ");
            userInput = scanner.nextInt();
        }

        if (pairsCount > 0) {
            System.out.println("Total pairs entered: " + pairsCount);
        } else {
            System.out.println("Any pair entered");
        }
        scanner.close();
    }
}
