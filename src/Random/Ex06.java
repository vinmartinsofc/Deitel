package Random;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = 0;
        double sumGrades = 0.0;
        double classAverage = 0.0;
        double higherGrade = Integer.MIN_VALUE;
        double lowerGrade = Integer.MAX_VALUE;
        int aboveAverageCount = 0;

        System.out.printf("%n%s%n%s",
                "You can stop at any time by entering -1.",
                "Enter the students grade: ");
        int grade = scanner.nextInt();

        while (grade != -1) {
            studentsCount += 1;
            sumGrades += grade;
            classAverage = sumGrades / studentsCount;

            if (grade > classAverage) {
                aboveAverageCount += 1;
            }

            if (grade > higherGrade) {
                higherGrade = grade;
            }

            if (grade < lowerGrade && lowerGrade != higherGrade) {
                lowerGrade = grade;
            }

            System.out.printf("%s%n%s",
                    "You can stop at any time by entering -1.",
                    "Enter the students grade: ");
            grade = scanner.nextInt();
        }

        if (studentsCount > 0) {

            System.out.printf("Average %.2f%n" +
                    "Total Students %d%n" +
                    "Higher grade %.2f%n" +
                    "Lower grade %.2f%n" +
                    "Students above average %d%n", classAverage, studentsCount, higherGrade, lowerGrade, aboveAverageCount);
        } else {
            System.out.println("Something went wrong");
        }

        scanner.close();
    }
}
