package Inheritance;

public class SDET extends Employee{
    // instance variables

    String managerName;
    String automationTool;

    public void toolsUsed(){
        System.out.println(fullName + " is using " + automationTool);
    }

    public static void main(String[] args) {
        SDET sdet = new SDET();
        sdet.fullName = "Charlie Chaplin";
        sdet.yearlyGrossSalary = 120;
        sdet.monthlySalary();
        sdet.automationTool = "Selenium";
        sdet.toolsUsed();

    }


}
