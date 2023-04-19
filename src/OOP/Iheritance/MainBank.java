package OOP.Iheritance;

public class MainBank {
    double interestrate = 0;
    static String name;
    static double totalAmount;



    public static void deposit(double amount){
        System.out.println(amount + " was deposited into your account");
        System.out.println("Total amount is : $" + (amount + totalAmount ));
        totalAmount += amount;
    }
    public static void withdraw(double amount){
        System.out.println(amount + " was withdraw from your account");
        System.out.println("Total amount is : $" + (totalAmount - amount));
        totalAmount -= amount;
    }
    public void printName(){
        System.out.println(name);
    }
    public void addTwoNumbers(){
        System.out.println(10+10);
    }
}
