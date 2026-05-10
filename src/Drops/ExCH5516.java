package Drops;

//Dropped

import java.util.Scanner;

public class ExCH5516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.printf("%s%n", "Enter the five integers (1-30)");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();

        for (int j = 0; j < n1; j++) {
            System.out.print("*");
        }

        System.out.println();

        for (int j = 0; j < n2; j++) {
            System.out.print("*");
        }

        System.out.println();

        for (int j = 0; j < n3; j++) {
            System.out.print("*");
        }

        for (int j = 0; j < n4; j++) {
            System.out.print("*");
        }

        System.out.println();

        for (int j = 0; j < n5; j++) {
            System.out.print("*");
        }

        System.out.println();

    }
}
