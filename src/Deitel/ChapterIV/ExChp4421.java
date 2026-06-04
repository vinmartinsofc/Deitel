package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 10;
        int largest = 0;

        while (count != 0) {

            System.out.print("Enter the integer (" + count + ") left: ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
            --count;

        }
            if (largest > 0) {
                System.out.print("Largest: " + largest);
            } else {
                System.out.println("No integers entered");
            }
        }


}

