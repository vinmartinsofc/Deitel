package Deitel.ChapterIII;

public class HealthProfile {
    private String lastName;
    private String firstName;
    private String sex;
    private int bornYear;
    private int bornMonth;
    private int bornDay;
    private double weihgt;
    private double height;
    private static final int CURRENT_YEAR = 2026;

    public HealthProfile(String lastName, String name,String sex,  int bornYear, int bornMonth, int bornDay, double weihgt, double height) {
        this.firstName = name;
        this.lastName = lastName;
        this.sex = sex;
        this.bornYear = bornYear;
        this.bornMonth = bornMonth;
        this.bornDay = bornDay;
        this.weihgt = weihgt;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public double getWeihgt() {
        return weihgt;
    }

    public void setWeihgt(int weihgt) {
        this.weihgt = weihgt;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeihgt(double weihgt) {
        this.weihgt = weihgt;
    }

    public int getAgeInYears() {
        return  CURRENT_YEAR - bornYear;

    }

    public double getMaxHeartFrequency() {
        return 220 - getAgeInYears();
    }

    public double getMinTargetHeartFrequency() {
        return 0.50 * getMaxHeartFrequency();
    }

    public double getMaxTargetHeartFrequency() {
        return 0.85 * getMaxHeartFrequency();
    }

    public double getImc() {
        return weihgt / (height * height);
    }

    public void displayInfo() {
        System.out.println("**************");
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + getAgeInYears());
        System.out.printf("Body Mass (IMC): %.2f%n", getImc());
        System.out.printf("Min Heart Freq: %.2f%n", getMinTargetHeartFrequency());
        System.out.printf("Max Heart Freq: %.2f%n", getMaxTargetHeartFrequency());
    }

}

