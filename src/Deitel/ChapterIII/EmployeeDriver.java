package Deitel.ChapterIII;

public class EmployeeDriver {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mark", "Web Designer", 5000);
        Employee employee2 = new Employee("Mano deyvin", "Deb Ruby", 10000);


        System.out.println("Employee 1 Salary: " + employee1.getMontlyPayment());
        System.out.println("Employee 2 Salary: " + employee2.getMontlyPayment());

        double salaryCalculation = employee1.getMontlyPayment() * 10 / 100;
        double salaryCalculation2 = employee2.getMontlyPayment() * 10 / 100;

        employee1.setMontlyPayment(employee1.getMontlyPayment() + salaryCalculation);
        employee2.setMontlyPayment(employee2.getMontlyPayment() + salaryCalculation2);

        System.out.println("Emplyee 1 with 10% increase: " + employee1.getMontlyPayment());
        System.out.println("Emplyee 2 with 10% increase: " + employee2.getMontlyPayment());



    }
}
