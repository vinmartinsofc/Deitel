package Deitel.ChapterIV;


import java.util.Scanner;

public class ExChp4437 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        System.out.print("Enter the integer: ");
        int userNumber = scanner.nextInt();


        while (userNumber > 0) {
            int n1 = userNumber;
            int n2 = n1 * (--userNumber);

            result += (--n2) * userNumber;

//            --userNumber;
        }


        System.out.println("Factorial: " + result);

    }
}
