import java.util.Scanner;

public class Shopping {
    // create 5 attributes
    // create 3 methods

    int x;
    int y;
    double price;
    double totalPrice;
    boolean purchase;

    public static void main(String[] args) {
        Shopping cart = new Shopping();
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to purchase Sunglasses?");
        String answer = sc.next();
        if (answer.contains("Yes")) {
            cart.purchase = true;
        }else{
            cart.purchase = false;
        }


        cart.Perfumes();
        System.out.println(cart.price);

    }


    public void Perfumes() {
        if (purchase) {
            System.out.println("You purchased Perfumes");
            this.price = 100;

        } else {
            System.out.println("No Perfume Purchased");
        }


    }
}
