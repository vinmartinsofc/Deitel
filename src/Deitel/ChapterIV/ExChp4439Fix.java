package Deitel.ChapterIV;


public class ExChp4439Fix {
    public static void main(String[] args) {

        double rate = 0.035;
        double population = 214.2;
        double populationDifference = population;
        int yearNumber = 0;
        int theYearPopulationHasDuplicated = 0;
        boolean foundYear = false;
        boolean lastYearConfirmation = false;
        double sizeAt75 = 0;

        System.out.printf("%s %10s %10s %10s %10s", "Year", "Population", "x2 Year", "Increase", "Est.Final Size");

        while (yearNumber < 75) {
            double temp = population * rate;
            population += temp;

            if (!foundYear && population >= populationDifference * 2) {
                theYearPopulationHasDuplicated = yearNumber;
                foundYear = true;
            }

            if (!lastYearConfirmation && yearNumber == 75) {
                sizeAt75 = population;
                lastYearConfirmation = true;
            }


            if (yearNumber % 6 == 0) {
                System.out.printf("%n%5s", "-".repeat(46));

            }

            System.out.printf("%n%d %10.2f %10d %10.2f %10.2f",
                    yearNumber, population, theYearPopulationHasDuplicated, (population - populationDifference), sizeAt75);

            yearNumber++;
        }


    }
}
