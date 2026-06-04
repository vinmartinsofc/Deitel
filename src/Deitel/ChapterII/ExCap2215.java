package Deitel.ChapterII;

import java.util.Scanner;

public class ExCap2215 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer ");
        int firstInt = input.nextInt();

        System.out.print("Enter the second integer ");
        int secondInt = input.nextInt();

        int sum = firstInt + secondInt;
        int difference = firstInt - secondInt;
        int quocient = firstInt / secondInt;

        System.out.println("Product: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Quocient: " + quocient);


        input.close();
    }
}
