package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4437_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, calc;

        System.out.print("Enter the first integer: ");
        n1 = scanner.nextInt();

        while (n1 != -1) {

            System.out.print("Enter the second integer: ");
            n2 = scanner.nextInt();

            calc = n1 * n2;

            System.out.println(calc);

            System.out.print("Enter the first integer or -1 to quit: ");
            n1 = scanner.nextInt();

        }


    }
}
