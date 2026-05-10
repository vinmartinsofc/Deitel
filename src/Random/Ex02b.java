package Random;

import java.util.Scanner;

public class Ex02b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        double avg;

        System.out.print("Enter the integer (-1 to quit): ");
        int hasEntered = scanner.nextInt();

        while (hasEntered != -1) {

            if (hasEntered < 1) {
                System.out.println("Input not allowed");
            } else {
                sum += hasEntered;
                count += 1;
            }

            System.out.print("Enter the integer (-1 to quit): ");
            hasEntered = scanner.nextInt();
        }

        if (count <= 0) {
            System.out.println("No integers entered.");
        } else {
            avg = (double) sum / count;
            System.out.printf("%nTotal integers: %d%nSum: %d%nAvg: %.2f " , count, sum, avg);
        }

        scanner.close();
    }
}
