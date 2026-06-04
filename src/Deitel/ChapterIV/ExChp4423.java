package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4423 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        int largest = Integer.MIN_VALUE;
        int secondOne = Integer.MIN_VALUE;

        while (count < 5) {

            System.out.print("Enter the integer: ");
            number = scanner.nextInt();

            if (number > largest) {
                secondOne = largest;
                largest = number;
            } else if (number > secondOne && number != largest) {
                secondOne = number;
            }

            count++;
        }


        System.out.println("Largest: " + largest);
        System.out.println("Second One: " + secondOne);

    }

}

