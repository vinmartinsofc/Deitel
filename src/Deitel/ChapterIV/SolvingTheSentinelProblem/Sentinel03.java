package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        int totalPositive = 0;
        double avg;

        System.out.print("Enter the desired integer or -1 to quit: ");
        int userInput = scanner.nextInt();

        if (userInput != -1 ) {
           if (userInput > 0) {
               totalPositive += userInput;
               numberCount++;
           }
        }

        while (userInput != -1) {

            System.out.print("Enter the desired integer or -1 to quit: ");
            userInput = scanner.nextInt();

            if (userInput > 0) {
                totalPositive += userInput;
                numberCount++;
            }

        }

        if (numberCount > 1) {
            avg = (double) totalPositive / numberCount;
            System.out.printf("Avg is %.2f", avg);
        } else {
            System.out.println("Insuficient numbers entered");
        }


     scanner.close();
    }
}
