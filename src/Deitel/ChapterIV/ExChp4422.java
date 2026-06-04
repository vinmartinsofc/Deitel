package Deitel.ChapterIV;

public class ExChp4422 {
    public static void main(String[] args) {
        int number = 1;

        System.out.printf("%s %10s %10s %10s%n","N", "10*N", "100*N", "1000*N");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d %10d %10d %10d%n",number
                    ,number * 10
                    ,number * 100
                    ,number * 1000);
            ++number;
        }

    }
}
