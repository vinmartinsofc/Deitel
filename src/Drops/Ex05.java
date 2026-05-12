package Drops;

//dropped

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size (eg: 5): ");
        int n = scanner.nextInt();
        int size = n * n;

        System.out.print("*".repeat(size));
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < size; j++) {
                System.out.println("*");
            }

            System.out.print("*".repeat(size));
        }

        System.out.printf("%5s", "*");

        scanner.close();
    }
}
