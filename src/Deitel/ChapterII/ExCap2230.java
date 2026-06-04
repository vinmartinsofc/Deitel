package Deitel.ChapterII;

import java.util.Scanner;

public class ExCap2230 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the integers with five digits (ex: 56987):");
        int userInteger = input.nextInt();

        System.out.printf("You entered: %d %n", userInteger);

        int firstInteger = (userInteger / 10000) % 10;
        int secondInteger = (userInteger / 1000) % 10;
        int thirdInteger = (userInteger / 100) % 10;
        int fourthInteger = (userInteger / 10) % 10;
        int lastInteger = userInteger % 10;

        System.out.printf("Your Integer separted are: %d %d %d %d %d %n ", firstInteger, secondInteger, thirdInteger, fourthInteger, lastInteger);

        input.close();
    }
}
