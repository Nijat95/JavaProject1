public class Shoppping {
    // create 5 attributes(Instance vars)
    double milk;
    double bread;
    double apple;
    double butter;
    double banana;

    String storeName;

    // create 3 methods

    //constructor 1
    public Shoppping(int x, int y) {

    }
    public Shoppping(int x1, float y1) {

    }

    public void welcome(){
        System.out.println("Welcome to " + storeName);
    }

    public void sum(double milk, double bread, double apple, double butter, double banana) {
        this.milk = milk;
        this.bread = bread;
        this.apple = apple;
        this.butter = butter;
        this.banana = banana;

        System.out.println("Total price: " + milk + banana + apple + butter + bread);

    }

    public static void main(String[] args) {
        //Shoppping sh = new Shoppping();
        //sh.storeName = "COSTCO";
        //sh.welcome();


    }

}
