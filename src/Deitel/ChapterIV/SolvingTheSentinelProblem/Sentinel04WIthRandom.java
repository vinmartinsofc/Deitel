package Deitel.ChapterIV.SolvingTheSentinelProblem;

public class Sentinel04WIthRandom {
    public static void main(String[] args) {
        int rand = 0;
        int pairsCount = 0;

        while ( rand != -1) {
            if (rand % 2 == 0) {
                pairsCount++;
            }

            rand = (int) (Math.random() * 101) -10;

        }

        System.out.println("Total pairs: " + pairsCount);
        

    }

}
