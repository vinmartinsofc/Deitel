package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int itemCount = 0;
        double itemPrice;
        int fixedCommission = 200;


        System.out.print("Enter the item price or 0 to quit: ");
        itemPrice = scanner.nextDouble();
        System.out.println(" ");
        System.out.printf("%-10s %-10s%n", "Item", "Value");


        while (itemPrice != 0.0) {
            itemCount++;
            System.out.printf("%-10s %-10.2f%n", itemCount, itemPrice);
            total += itemPrice;

            System.out.print("Enter the item price or 0 to quit: ");
            itemPrice = scanner.nextDouble();

        }

        if (itemCount > 0) {
            double percentage = total * 9 / 100;
            System.out.printf("Total sold: %d, which is a total of %.2f this week.%n", itemCount, total);
            System.out.printf("Your commission is R$%d + %.2f = %.2f.%n", fixedCommission, percentage, fixedCommission + percentage);
        } else {
            System.out.println("Application closed by user");
        }

        scanner.close();
    }
}
