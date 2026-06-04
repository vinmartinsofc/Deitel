package Deitel.ChapterIV.SolvingTheSentinelProblem;

import java.util.Scanner;

public class Sentinel07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalApproved = 0;

        System.out.print("Enter the note or -1 to quit: ");
        int userNotes = scanner.nextInt();

        while (userNotes != -1) {

            if (userNotes >= 60) {
                totalApproved++;
            }

            System.out.print("Enter the note or -1 to quit: ");
            userNotes = scanner.nextInt();

        }

        if (totalApproved > 0) {
            System.out.println("Total of " + totalApproved + " students approved");
        } else {
            System.out.println("Any student has been approved");
        }

        scanner.close();
    }
}
