package Deitel.ChapterIV;

import java.util.Scanner;

public class ExChp4417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers;
        int fuel;
        int kilometersSum = 0;
        int fuelSum = 0;
        int tripCount = 0;
        double avgFuelPerLitter = 0;

        System.out.print("Enter the amount of kilometer ridden -1 to quit: ");
        kilometers = scanner.nextInt();

        while (kilometers != -1) {

            System.out.print("Enter the amount of fuel consumed: ");
            fuel = scanner.nextInt();

            kilometersSum += kilometers;
            fuelSum += fuel;
            tripCount++;

            System.out.printf("%d kilometers ridden with %d fuel does %.2f kilometers per litter %n",
                        kilometers, fuel, (double) kilometers / fuel);

            System.out.print("Enter the amount of kilometer ridden -1 to quit: ");
            kilometers = scanner.nextInt();
        }
        if (tripCount > 0) {
            if (fuelSum > 0) {
                avgFuelPerLitter = (double) kilometersSum / fuelSum;
            }
            System.out.println("Total trips: " + tripCount);
            System.out.printf("Average km per liter : %.2f%n", avgFuelPerLitter);
            System.out.printf("Total kilometers ridden: %d%n", kilometersSum);
            System.out.printf("Total fuel used: %d%n", fuelSum);
        } else {
            System.out.println("Application closed by user");
        }

        scanner.close();
    }

}
