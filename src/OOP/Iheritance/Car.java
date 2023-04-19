package OOP.Iheritance;

public class Car {

    static String type = "BMW";
    static int doors;
    static double mileage;

    public static void drive(String name){
        System.out.println(name + " Car is driving");
    }

    public static void stop(String name){
        System.out.println(name + " Car is stopping");
    }

    public static void parked(String name){
        System.out.println(name + " Car is parked");
    }

}
