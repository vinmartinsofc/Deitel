package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double note1;
        double note2 = 0;
        double note3 = 0;
        int weight1 = 0;
        int weight2 = 0;
        int weight3 = 0;
        double avg;
        int totalCalc = 0;

        System.out.print("Enter the first note (-1 to quit): ");
        note1 = scanner.nextDouble();

       while (note1 != -1) {

           System.out.print("Enter the weight (1, 2 or 3): ");
           weight1 = scanner.nextInt();
           System.out.print("Enter the second note: ");
           note2 = scanner.nextDouble();
           System.out.print("Enter the weight (1, 2 or 3): ");
           weight2 = scanner.nextInt();
           System.out.print("Enter the third note: ");
           note3 = scanner.nextDouble();
           System.out.print("Enter the weight (1, 2, or 3): ");
           weight3 = scanner.nextInt();
           totalCalc++;
           System.out.print("Enter the first note (-1 to quit): ");
           note1 = scanner.nextDouble();

       }


       if (totalCalc > 0) {
           avg = (note1 * weight1 + note2 * weight2 + note3 * weight3) / (weight1 + weight2 + weight3);
           System.out.printf("Avg is %.2f", avg);

       } else {
           System.out.println("Application closed by user");
       }


     scanner.close();
    }
}
