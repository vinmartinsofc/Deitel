package Deitel.ChapterV;

public class ContinueTest2 {
    public static void main(String[] args) {

        for (int count = 1; count <= 10; count++) {

            if (count == 5) {

                count += 1;
            }

            System.out.printf(" %d", count);

        }

        System.out.printf("%nUsed continue to skip printing 5%n");

    }
}
