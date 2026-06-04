package Deitel.ChapterV;

import java.util.Scanner;

public class ExChap5517 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productNumber;
        int amountSold = 0;
        double totalSales = 0.0;
        int unitsSold = 0;

        System.out.printf("%4s%n", "Enter the prodcut number (1-5) [-1 quits de program]");
        productNumber = scanner.nextInt();

        while (productNumber != -1) {

            System.out.println("Enter the amount sold: ");
            amountSold = scanner.nextInt();

            switch (productNumber) {
                case 1:
                    totalSales += 2.98 * amountSold;
                    unitsSold += amountSold;
                    break;
                case 2:
                    totalSales += 4.50 * amountSold;
                    unitsSold += amountSold;
                    break;
                case 3:
                    totalSales += 9.98 * amountSold;
                    unitsSold += amountSold;
                    break;
                case 4:
                    totalSales += 4.49 * amountSold;
                    unitsSold += amountSold;
                    break;
                case 5:
                    totalSales += 6.87 * amountSold;
                    unitsSold += amountSold;
                    break;
                default:
                    System.out.println("Invalid product number");
                    continue;
            }

            System.out.printf("%4s%n", "Enter the prodcut number (1-5) [-1 quits de program]");
            productNumber = scanner.nextInt();
        }

        if (amountSold > 0) {
            System.out.printf("Total sold: %d | Total price: US$: %.2f%n", unitsSold, totalSales);
        } else {
            System.out.println("There was no product sold.");
        }

    }

}
