package Deitel.ChapterIV;

import java.util.Scanner;
//F
public class ExChp4438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the four digit code: ");
        int userCode = scanner.nextInt();

        if (userCode >= 10000 || userCode < 1000) {
            System.out.println("Invalid.");
        } else {
            int d4 = userCode % 10;
            int d3 = userCode / 10 % 10;
            int d2 = userCode / 100 % 10;
            int d1 = userCode / 1000 % 10;

            int crypt4 = (d4 + 7) % 10;
            int crypt3 = (d3 + 7) % 10;
            int crypt2 = (d2 + 7) % 10;
            int crypt1 = (d1 + 7) % 10;

            int temp1 = crypt3;
            int temp2 = crypt4;



            System.out.printf("Cryptography: %d%d%d%d%n", temp2, temp1, crypt2, crypt1);
        }

    }
}

