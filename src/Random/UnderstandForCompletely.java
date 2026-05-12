package Random;

public class UnderstandForCompletely {
    public static void main(String[] args) {

        System.out.printf("%s%n", "Number:");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }


    }
}
