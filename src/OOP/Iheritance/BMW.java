package OOP.Iheritance;

public class BMW extends Car{


    public static void main(String[] args) {
        type = "BMW";
        mileage = 10.000d;
        doors = 4;
        System.out.println(type);
        System.out.println(mileage);
        System.out.println(doors);

        drive("BMW");
        stop("Bmw");
        parked("Bmw");


    }

   /* public static String getType(){
        return type;
    }

    */
}
