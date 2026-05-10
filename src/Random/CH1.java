package Random;

public class CH1 {
    public static void main(String[] args) {
        int totalTrials = 0;
        int rodadas = 10;

        for (int i = 0; i < rodadas; i++) {
            int num = 128;
            int guess = -1;
            int trials = 0;

            while (guess != num) {
                guess = (int) (Math.random() * 129);
                trials++;
            }

            System.out.println("Rodada " + (i + 1) + ": " + trials + " tentativas");
            totalTrials += trials;
        }

        double media = (double) totalTrials / rodadas;
        System.out.println("Média de tentativas: " + media);


    }

}
