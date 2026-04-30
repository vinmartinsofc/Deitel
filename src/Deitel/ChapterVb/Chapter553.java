package Deitel.ChapterVb;

public class Chapter553 {
    public static void main(String[] args) {
//        a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for. Assuma que as variáveis de inteiro sum e count foram declaradas

        int sum = 0, count;

        for (count = 1; count <= 99; count++) {

            if (count % 2 > 0) {
                sum += count;
            }

        }

        System.out.printf("Sum:%d%n", sum);


    }
}
