package Inheritance;

public class Employee {
    String fullName;
    String department;
    int yearlyGrossSalary;
    String joiningDate;

    public void monthlySalary(){
        System.out.println(yearlyGrossSalary / 12 + " is the monthlySalary of " + fullName);
    }

}
