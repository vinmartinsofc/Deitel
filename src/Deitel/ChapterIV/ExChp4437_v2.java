package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4437_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 1;
        int temp2;
        int temp = 1;


        System.out.print("Enter the integer: ");
        int userNumber = scanner.nextInt();

        while (userNumber >= 1) {

            temp2 = userNumber * temp;

            result = temp2 * result;

            userNumber--;
        }

        System.out.printf("Factorial: %.2f%n ", result);

    }
}
