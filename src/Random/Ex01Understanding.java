package Random;

public class Ex01Understanding {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.println("Internal ---- " + j + "---------");
            }

            System.out.println("External ---- " + i + "---------");


        }


    }
}
