package Deitel.ChapterII;

public class ExCap2226 {
    public static void main(String[] args) {
        int rand;
        int n1 = 0, n2 = 0;

        for (int i = 0; i < 2; i++) {
            rand = (int) (Math.random() * 11);

            if (n1 == 0) {
                n1 = rand;
                continue;
            }

            n2 = rand;

        }

            if (n1 == 0) {
                System.out.println("N1 is zero, operation can't be made");
                System.exit(0);
            } else if (n2 ==0){
                System.out.println("N2 is zero, operation can't be made");
                System.exit(0);
            }

            if ( n1 % n2 == 0) {
                System.out.println("N1 é um múltiplo de n2");
            } else if (n2 % n1 == 0) {
                System.out.println("N2 é um múltiplo de n1");
            } else {
                System.out.println("Ningém é múltiplo de ninguém!");
            }


    }
}
