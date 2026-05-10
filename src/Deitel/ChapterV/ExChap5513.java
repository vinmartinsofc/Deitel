package Deitel.ChapterV;

public class ExChap5513 {
    public static void main(String[] args) {
        long factorial = 1;
        int iterator = 1;

        for (int i = 1; i <= 20; i++) {
            factorial = iterator++ * factorial;
        }

        System.out.printf("Factorial: %d", factorial);

    }
}
