package Random;

public class Ex04 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.printf("--- tabuada do %d ----%n",i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n",i, j, i * j);
            }

            System.out.println();
        }

    }
}
