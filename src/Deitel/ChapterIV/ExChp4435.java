package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4435 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Enter the three integer (eg: 5 1 9): ");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a + b > c) {
                System.out.println("Valid!");
            } else {
                System.out.println("Not valid!");
            }

        input.close();
    }
}
