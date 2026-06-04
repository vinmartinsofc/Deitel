package Deitel.ChapterIII;

import java.util.Scanner;

public class HearRatesDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = scanner.next();
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.print("The year you were born in: ");
        int year = scanner.nextInt();
        System.out.print("Of which month? ");
        int month = scanner.nextInt();
        System.out.print("The day you were born in: ");
        int day = scanner.nextInt();


        HeartRates heartRates = new HeartRates(lastName, firstName, year, month, day);
        heartRates.getUserInfo(heartRates);


    }
}
