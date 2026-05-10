package Random;

import java.util.Scanner;

public class CH1_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 129);
        int guess;
        int trials = 1;

        System.out.println("Guess what number is it: ");
        guess = scanner.nextInt();

        while (guess != secretNumber) {
            trials++;

            if (guess > secretNumber) {
                System.out.println("Try a lower number");
            } else {
                System.out.println("You should try a higher number");
            }

            System.out.println("Guess what number is it: ");
            guess = scanner.nextInt();
        }

        if (trials > 1) {
            System.out.println("You've got the right number after " + trials + " trials.");
        } else {
            System.out.println("You did it with just one guess!");
        }

    }
}
