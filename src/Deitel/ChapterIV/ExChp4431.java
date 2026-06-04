package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4431 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int binaryInput;

        do {
            System.out.print("Enter the binary or -1 to quit: ");
            binaryInput = input.nextInt();


            int n4 = binaryInput % 10;
            int n2 = binaryInput / 10 % 10;
            int n3 = binaryInput / 100 % 10;
            int n1 = binaryInput / 1000 % 10;


            if (n4 < 0) {
                System.out.println(".....");
            } else {
                System.out.printf("%-5d %-5d %-5d %-5d%n", n4, n3, n2, n1);;
            }

        } while (binaryInput != -1);


        input.close();


        //skipped
    }
}
