package encapsulation;

public class Motorcycle {
    public static void main(String[] args) {
        Dealer motor = new Dealer();
        motor.setPrice(13000);
        motor.setBrandName("Harley Davidson");
        System.out.println(motor.getBrandName());
        System.out.println(motor.price());
        motor.setUsedOrNew("Used");
        System.out.println(motor.UsedOrNew());
    }

}
