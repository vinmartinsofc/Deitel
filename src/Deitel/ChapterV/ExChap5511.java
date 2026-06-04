package Deitel.ChapterV;

import java.util.Scanner;

public class ExChap5511 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int numbers;

        System.out.print("Enter the amount of numbers: ");
        int loopSetter = scanner.nextInt();

        for (int i = 1; i <= loopSetter; i++) {

            System.out.print("Enter the integer: ");

            numbers = scanner.nextInt();

            if (numbers < minNumber) {
                minNumber = numbers;
            }

        }

        if (minNumber == Integer.MAX_VALUE) {
            System.out.println("....");
        } else {
            System.out.println("Lowest: " + minNumber);
        }
        scanner.close();
    }
}
