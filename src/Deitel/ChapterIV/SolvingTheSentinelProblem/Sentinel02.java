package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highest;

        System.out.print("Enter the integer or -1 to exit: ");
        int userNumbers = input.nextInt();
        highest = userNumbers;

        while (userNumbers != -1) {

            if (userNumbers > highest) {
                highest = userNumbers;
            }
            System.out.print("Enter the integer or -1 to exit: ");
            userNumbers = input.nextInt();

        }
            if (highest == -1) {
                System.out.println("User didn't provide any number");
            } else {
                System.out.printf("Highest integer entered: %d%n",highest);
            }

            input.close();
    }
}
