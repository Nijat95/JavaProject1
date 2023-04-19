package OOP.Iheritance;

public class Ford extends Car{

    public static void main(String[] args) {

        drive("Ford focus");
        stop("Ford mustang");
        parked("Ford F150");

        mileage = 10.234d;
        type = "F150";
        doors = 4;
        System.out.println(mileage + " " + type + " " + doors);

    }
}
