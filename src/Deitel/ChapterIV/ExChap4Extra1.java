package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChap4Extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;
        int numAmount = 1;
        int highest;
        int lowest = Integer.MAX_VALUE;

        System.out.print("Enter the amount of integer (Enter 0 to quit)): ");
        int numbers = scanner.nextInt();

        highest = numbers;
        sum = numbers;

        while (numbers != 0) {

            if (numbers < lowest) {
                lowest = numbers;
            } else if (numbers > highest) {
                highest = numbers;
            }

            System.out.print("Enter the amount of integer (Enter 0 to quit)): ");
            numbers = scanner.nextInt();

            if (numbers == 0) {
                System.out.println(".....");
            } else {
                sum += numbers;
                numAmount++;
            }
        }


        if (numAmount == 1) {
            System.out.println("No Integers entered.");
        } else {
            double avg = (double) sum / numAmount;
            System.out.println("Sum: " + sum);
            System.out.println("Num Amount: " + numAmount);
            System.out.printf("Avg: %.2f%n", avg);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);

        }

        scanner.close();
    }
}
