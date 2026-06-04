package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String workerName;
        double salary;
        int hoursWorked;
        int count = 1;
        double salaryHour;

        while (count < 4) {
            System.out.print("Enter the name of the " + count + " worker: ");
            workerName = scanner.nextLine();

            System.out.printf("Welcome, %s!%n", workerName);

            System.out.print("Enter the amount of hours worked: ");
            hoursWorked = scanner.nextInt();

            System.out.print("What are the salary-hour?: ");
            salaryHour = scanner.nextDouble();
            scanner.nextLine();

            if (hoursWorked > 40) {
                double overtimeHours = hoursWorked - 40;
                salary = (40 * salaryHour) + (overtimeHours * salaryHour * 1.5);
            } else {
                salary = hoursWorked * salaryHour;
            }

            System.out.printf("Total week's earn: %.2f%n", salary);

            count++;
        }


        scanner.close();

    }
}
