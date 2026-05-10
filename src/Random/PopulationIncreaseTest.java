package Random;

public class PopulationIncreaseTest {
    public static void main(String[] args) {

        double rate = 0.035;
        double population = 8.1;
        double initialPopulation = population;
        int yearNumber = 1;
        int yearDoubled = -1;


        System.out.printf("%-6s %-25s %-25s%n", "Ano", "População (bilhões)", "Aumento (bilhões)");
        System.out.println("-".repeat(60));

        while (yearNumber <= 75) {
            double increase = population * rate;
            population += increase;


            System.out.printf("%-6d %-25.4f %-25.4f%n", yearNumber, population, increase);

            if (yearDoubled == -1 && population >= initialPopulation * 2) {
                yearDoubled = yearNumber;
            }

            yearNumber++;
        }

        System.out.printf("%nA população dobra no ano: %d%n", yearDoubled);
    }
}