package Deitel.ChapterV;

public class ExChap5529 {
    public static void main(String[] args) {
        String matchDay = "";

        for (int days = 1; days <= 12; days++) {

            switch (days) {
                case 1:
                    matchDay = "first";
                    break;
                case 2:
                    matchDay = "second";
                    break;
                case 3:
                    matchDay = "third";
                    break;
                case 4:
                    matchDay = "fourth";
                    break;
                case 5:
                    matchDay = "fifth";
                    break;
                case 6:
                    matchDay = "sixth";
                    break;
                case 7:
                    matchDay = "seventh";
                    break;
                case 8:
                    matchDay = "eighth";
                    break;
                case 9:
                    matchDay = "ninth";
                    break;
                case 10:
                    matchDay = "tenth";
                    break;
                case 11:
                    matchDay = "eleventh";
                    break;
                case 12:
                    matchDay = "twelfth";
                    break;
                default:
                    System.out.println("No days match");
            }

            System.out.printf("On the %s day of Christmas my true love sent to me%n", matchDay);

            switch (days) {

                
            }



            }

        }
    }

