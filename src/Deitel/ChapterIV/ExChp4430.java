package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sentinel = -1;

        System.out.print("Enter the five digits integer (eg: 12321) or -1 to quit: ");
        number = input.nextInt();

        while (number != sentinel) {

            if (number >= 100000 || number < 10000) {
                System.out.println("Invalid input, try again ");
            } else {
                int n1 = number / 10000 % 10;
                int n2 = number / 1000 % 10;
//                int n3 = number / 100 % 10;
                int n4 = number / 10 % 10;
                int n5 = number % 10;

                if (n1 == n5 && n2 == n4) {
                    System.out.println("Palindrome!");
                } else {
                    System.out.println("It's not a Palindrome.");
                }
            }

            System.out.print("Enter the five digits integer (eg: 12321) or -1 to quit: ");
            number = input.nextInt();

        }

            System.out.println("Application closed.");

        input.close();
    }
}

