package Deitel.ChapterV;

public class ExChap5514 {
    public static void main(String[] args) {
        double rate;

        for (rate = 5; rate <= 10; rate++) {
            double balance = 1000.0;

            System.out.printf("%4s %10s%n", "Year", "Balance");
            for (int i = 1; i <= 10; i++) {

                balance += balance * (rate / 100);

                System.out.printf("%1d %,10.2f%n", i, balance);

            }

            System.out.println();
        }
    }
}
