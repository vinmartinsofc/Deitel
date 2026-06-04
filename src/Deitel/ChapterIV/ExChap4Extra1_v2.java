package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChap4Extra1_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        System.out.print("Enter the integer: ");
        int number = scanner.nextInt();

        while (number != 0) {
                sum += number;
                count++;

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

            System.out.print("Enter the integer [0 quits it]: ");
            number = scanner.nextInt();
        }

        if (count > 0) {
            avg = (double) sum / count;
            System.out.println("Total: " + sum);
            System.out.println("Amount Entered:" + count);
            System.out.printf("Avg: %.2f%n", avg);
            System.out.println("Highest: " + max);
            System.out.println("Lowest: " + min);
        } else {
            System.out.println("Bye '-'");
        }

        scanner.close();
    }
}
