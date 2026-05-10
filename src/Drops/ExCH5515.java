package Drops;

//Dropped

public class ExCH5515 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 10; i >= 1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");

        for (int i = 10; i >= 1 ; i--) {

            for (int s = 1; s <= (10 - i) / 2; s++) {
                System.out.print(' ');
            }

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
