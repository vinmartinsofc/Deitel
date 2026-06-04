package Deitel.ChapterII;

import java.util.Scanner;

public class ExCap2224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Integer 1 ?");
        int n1 = input.nextInt();

        System.out.print("Integer 2 ?");
        int n2 = input.nextInt();

        System.out.print("Integer 3 ?");
        int n3 = input.nextInt();

        System.out.print("Integer 4 ?");
        int n4 = input.nextInt();

        System.out.print("Integer 5 ?");
        int n5 = input.nextInt();

        if (n1 > n2 & n1 > n3 && n1 > n4 && n1 > n5) {
            System.out.println(n1 + " highest");
        } else if (n2 > n1 & n2 > n3 && n2 > n4 && n2 > n5) {
            System.out.println(n2 + " highest");
        } else if (n3 > n1 & n3 > n2 && n3 > n4 && n3 > n5) {
            System.out.println(n3 + " highest");
        } else if (n4 > n1 & n4 > n2 && n4 > n3 && n4 > n5) {
            System.out.println(n4 + " highest");
        } else {
            System.out.println(n5 + " highest");
        }

        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
            System.out.println(n1 + " lowest");
        } else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
            System.out.println(n2 + " lowest");
        } else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
            System.out.println(n3 + " lowest");
        } else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
            System.out.println(n4 + " lowest");
        } else {
            System.out.println(n5 + " lowest");
        }

        input.close();
    }
}
