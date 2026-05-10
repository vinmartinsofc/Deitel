package Random;

public class Chapter553 {
    public static void main(String[] args) {

        int sum = 0, count;

        for (count = 1; count <= 99; count++) {
            if (count % 2 > 0) {
                sum += count;
            }
        }

        System.out.printf("Sum:%d%n", sum);

    }
}
