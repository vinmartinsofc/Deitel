package Random;

public class Ex03c {
    public static void main(String[] args) {
        int number1 = 0, number2 = 0;

        System.out.printf("%s %7s%n", "Number", "Result");
        for (int i = 1; i <= 10; i++) {
            ++number1;
            ++number2;
            System.out.printf("%2dx%d:%7d%n", number1, number1, number1 * number2);
        }

    }
}
