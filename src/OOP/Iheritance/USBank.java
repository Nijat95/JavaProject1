package OOP.Iheritance;

public class USBank extends MainBank{
    public static void main(String[] args) {
        totalAmount = 400;
        name = "USBank";
        //deposit(600);
        //printName();
    }
    @Override
    public void printName(){
        System.out.println(name);
    }
    @Override
    public void addTwoNumbers(){
       super.addTwoNumbers();
    }

}
