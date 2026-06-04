package Deitel.ChapterV;

public class ExChap553 {
    public static void main(String[] args) {
        int sum = 0, count;

        for (count = 1; count <= 99; count += 2) {

            sum = count;

            count = count + 2;
        }

        System.out.println("Sum: " + sum);
    }
}
