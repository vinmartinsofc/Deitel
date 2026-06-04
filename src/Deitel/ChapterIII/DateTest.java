package Deitel.ChapterIII;

public class DateTest {
    public static void main(String[] args) {
        Date dateTest = new Date(24, 2, 2026);
        Date bornDate = new Date(4, 2, 1994);

        System.out.print("Today is: ");
        dateTest.displayDate();
        System.out.print("I was born in: ");
        bornDate.displayDate();

    }
}
