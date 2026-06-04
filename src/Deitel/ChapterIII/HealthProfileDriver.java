package Deitel.ChapterIII;

import java.util.Scanner;

public class HealthProfileDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = scanner.next();
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Enter the year you were born in: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        System.out.print("Now enter the day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the sex (eg: M for male and F for female): ");
        String sex = scanner.next();
        System.out.print("Your weight (Use Killograms): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your Height(Eg: 1.80 for 180 centimeters) : ");
        double height = scanner.nextDouble();

        HealthProfile healthProfile = new HealthProfile(lastName, firstName, sex, year, month, day, weight, height);
        healthProfile.displayInfo();


    }
}