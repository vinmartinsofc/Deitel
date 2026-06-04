package Deitel.ChapterIV;


public class ExChp4439 {
    public static void main(String[] args) {

        double rate = 0.0035;
        double population = 214.2;
        double populationDifference = population;
        int yearNumber = 1;
        String msg = "";
        int theYearPopulationHasDuplicated;
        boolean fouldYear = false;

        while (yearNumber < 76) {
            double temp = population * rate;
            population += temp;

            System.out.printf("Pop rate = %.2f%n", population);

            if (!fouldYear && population >= populationDifference * 2) {
                theYearPopulationHasDuplicated = yearNumber;
                msg = "Population as duplicated its initial value at the: " + theYearPopulationHasDuplicated + " year.";
                fouldYear = true;
            }

            if (yearNumber == 75) {
                System.out.printf("%nEstimated Population size at year 75: %.2f%n ", population);
                System.out.printf("%nPopulation has increased in: %.2f%n", population - populationDifference);

                System.out.printf("%n%s%n", msg);


            }

            yearNumber++;
        }


    }
}
