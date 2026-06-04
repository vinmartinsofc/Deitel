package Deitel.ChapterIII;

import java.util.Scanner;

public class HeartRates {
    private String name;
    private String lastName;
    private int bornYear;
    private int bornMonth;
    private int bornDay;
    private static final int CURENT_YEAR = 2026;
    private static final Scanner SCANNER = new Scanner(System.in);


    public HeartRates(String lastName, String name, int bornYear, int bornMonth, int bornDay) {
        this.name = name;
        this.lastName = lastName;
        this.bornYear = bornYear;
        this.bornMonth = bornMonth;
        this.bornDay = bornDay;
    }

    public int calculateCurrentAge() {
        return HeartRates.CURENT_YEAR - bornYear;
    }

    public double getMaxHeartFreq() {
        return 220 - calculateCurrentAge();
    }

    public double getMaxHeartPercentage() {
        return 0.85 * getMaxHeartFreq();
    }

    public double getMinimumHeartPercentage() {
        return 0.50 * getMaxHeartFreq();
    }

    public void getUserInfo(HeartRates heartRates) {
        System.out.println("LastName: " + lastName);
        System.out.println("Name: " + name);
        System.out.println("Born in: " + getCompleteBornDate());
        System.out.println("Max heart frequency per minute: " + getMaxHeartFreq());
        System.out.printf("Min target frequency  %.2f%n", getMinimumHeartPercentage());
        System.out.printf("Max target frequency  %.2f%n", getMaxHeartPercentage());
        System.out.println("************************");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompleteBornDate() {
        return bornYear + "-" + bornMonth + "-" + bornDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public int getBornMonth() {
        return bornMonth;
    }

    public void setBornMonth(int bornMonth) {
        this.bornMonth = bornMonth;
    }

    public int getBornDay() {
        return bornDay;
    }

    public void setBornDay(int bornDay) {
        this.bornDay = bornDay;
    }
}
