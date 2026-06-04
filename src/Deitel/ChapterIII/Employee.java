package Deitel.ChapterIII;

public class Employee {
    private String name;
    private String profession;
    private double montlyPayment;

    public Employee(String name, String midNama, double montlyPayment) {
        this.name = name;
        this.profession = midNama;

        if (montlyPayment < 0.0) {
            montlyPayment = 0.0;
            System.out.println("Montly payment can't be negative: " + montlyPayment);
        } else {
            this.montlyPayment = montlyPayment;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getMontlyPayment() {
        return montlyPayment;
    }

    public void setMontlyPayment(double montlyPayment) {
        this.montlyPayment = montlyPayment;
    }




}
