package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4437_v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired integer: ");
        int userInteger = scanner.nextInt();
        int result = 1;

        while (userInteger > 1) {

            result = userInteger * result;

            userInteger--;
        }

        System.out.printf("%d%n", result);
    }
}
