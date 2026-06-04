package Deitel.ChapterII;

public class ExCap2217 {
    public static void main(String[] args) {
        int rand;
        int n1 = 0, n2=0, n3=0;
        int sum;
        int avg;
        int product;

        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * 11);

            if (n1 == 0) {
                n1 = rand;
            } else if (n2 == 0) {
                n2 = rand;
            } else {
                n3 = rand;
            }
        }

        System.out.print("Debug 1: " + n1);
        System.out.print(", Debug 2: " + n2);
        System.out.print(", Debug 3: " + n3 + "\n");

            sum = n1 + n2 + n3;
            avg = (n1 + n2 + n3) / 3;
            product = n1 * n2 * n3;

            System.out.println("Sum: " + sum);
            System.out.println("Avg: " + avg);
            System.out.println("Product: " + product);

            if (n1 > n2 && n1 > n3) {
                System.out.println("N1: " + n1 + " highest.");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println("N2: " + n2 + " highest.");
            } else {
                System.out.println("N3: " + n3 + " highest.");

            }

        }

}
