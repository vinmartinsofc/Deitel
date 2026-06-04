package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4418 {
    public static void main(String[] args) {
        int accountNumber;
        int beginningOfTheMonthBalance;
        int totalPurchases;
        int totalUsedCredits;
        int maxCreditLimit;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account number or press 0 to exit: ");
        accountNumber = scanner.nextInt();

        while (accountNumber != 0) {

            System.out.print("Enter the balance at the beginning of the month: ");
            beginningOfTheMonthBalance = scanner.nextInt();

            System.out.print("Enter the total purchases: ");
            totalPurchases = scanner.nextInt();

            System.out.print("Enter the total credits used: ");
            totalUsedCredits = scanner.nextInt();

            System.out.print("Enter the autorized credit limit: ");
            maxCreditLimit = scanner.nextInt();

            int updatedBalance = beginningOfTheMonthBalance + totalPurchases - totalUsedCredits;

            System.out.printf("%s %d%n", "Your balance:", updatedBalance);

            if (updatedBalance > maxCreditLimit) {
                System.out.println("Credit Limit Exceeded!");
            }

            System.out.print("Enter the account number or press 0 to exit: ");
            accountNumber = scanner.nextInt();

        }

        System.out.println("Application closed.");
    }
}