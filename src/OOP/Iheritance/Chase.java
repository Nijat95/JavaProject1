package OOP.Iheritance;

public class Chase extends MainBank{
    public static void main(String[] args) {
        totalAmount = 100;
        name = "Chase";
        //printName();
        deposit(500);
        deposit(500);
        deposit(500);
        withdraw(600);
        withdraw(200);



    }
    @Override
    public void printName(){
        System.out.println("Test");
    }
    @Override
    public void addTwoNumbers(){
        System.out.println(30+20);
    }
    public void addNumbers(){
        System.out.println(10+10);
    }
    public void addNumbers(int i){
        System.out.println(10 + i);
    }
    public void addNumbers(int x, int y){
        System.out.println(x + y);
    }
    public void addNumbers(double x, double y){
        System.out.println(x + y);
    }
    public void addNumbers(String i, double y){
        System.out.println(i + y);
    }
}
