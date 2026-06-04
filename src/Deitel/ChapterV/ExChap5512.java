package Deitel.ChapterV;

public class ExChap5512 {
    public static void main(String[] args) {
        int number = 1;

        for (int i = 1; i <= 15; i += 2) {
                number *= i;
        }
        System.out.println("Product: " + number);
    }
}
