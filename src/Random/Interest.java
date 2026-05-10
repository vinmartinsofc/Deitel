package Random;

public class Interest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;


        for (int updateRate = 5; updateRate <= 10; updateRate++) {

            System.out.printf("%s%20s %n", "Year", "Amount on deposit");
            for (int year = 1; year <= 10; year++) {

                amount = principal * Math.pow(1.0 + ((double) updateRate / 100), year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }


        }


    }
}
