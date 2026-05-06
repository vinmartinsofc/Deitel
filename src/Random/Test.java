package Random;


public class Test {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 11);


        if (i % 2 == 0) {
            System.out.println("Even");
        } else  {
            System.out.println("Odd");
        }


    }


}
