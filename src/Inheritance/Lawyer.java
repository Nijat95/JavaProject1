package Inheritance;

public class Lawyer extends Employee {
    String partnerName;
    String caseName;

    public void research(){
        System.out.println(fullName + " and " + partnerName + " is investigating " + caseName);
    }


    public static void main(String[] args) {
        Lawyer law = new Lawyer();
        law.fullName = "Peter Pan";
        law.yearlyGrossSalary = 1000;
        law.caseName = "Titanic";
        law.partnerName = "Jack Sparrow";
        law.research();
        law.monthlySalary();

    }
}
