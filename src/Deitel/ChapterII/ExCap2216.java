package Deitel.ChapterII;

import java.util.Scanner;

public class ExCap2216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer ");
        int  first = input.nextInt();

        System.out.print("Enter second integer ");
        int  second = input.nextInt();

        if (first > second) {
            System.out.println(first + " Is larger than " + second);
        } else if (second > first){
            System.out.println(second + " Is larger than " + first);
        } else {
            System.out.println("These numbers are equal");
        }

        input.close();

    }
}
