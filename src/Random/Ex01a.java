package Random;

import java.util.Scanner;

public class Ex01a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade (0-100): ");
        int grades = scanner.nextInt();

            if (grades >= 90 && grades <= 100) {
                System.out.println("Grade is A");
            } else if (grades >= 80 && grades <= 89) {
                System.out.println("Grade is B");
            } else if (grades >= 70 && grades <= 79) {
                System.out.println("Grade is C");
            } else if (grades >= 60 && grades <= 69) {
                System.out.println("Grade is D");
            } else if (grades >= 0 && grades < 60) {
                System.out.println("Grade is F");
            } else {
                System.out.println("Input out of range.");
            }

        scanner.close();
    }
}
