package Random;

import java.util.Scanner;

public class Ex05e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int BASE_PAY = 200;

        System.out.print("Enter the amount sold R$: ");
        int weeklySales = scanner.nextInt();

        double computeSalary = weeklySales * (9.0 / 100.0);

        System.out.printf("Your salary:%,.2f%n", BASE_PAY + computeSalary);


        scanner.close();
    }
}
