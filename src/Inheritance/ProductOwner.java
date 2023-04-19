package Inheritance;

public class ProductOwner extends Employee{

    String managerName;

    public void talents(){
        System.out.println(fullName + " can paint");
    }

    public static void main(String[] args) {
        ProductOwner po = new ProductOwner();
        po.fullName = "Chris Brown";
        po.yearlyGrossSalary = 100000;
        po.monthlySalary();
        po.talents();
    }
}
