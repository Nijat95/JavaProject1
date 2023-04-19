package Driver;

import Car.Benz.CLSClass2022;
import Car.Nissan.SentraClass;
import Car.Porsche.PanameraClass;

//inheritance
public class Driver1 extends SentraClass{
    public static void main(String[] args) {
        CLSClass2022 cls = new CLSClass2022();
        cls.nameOfTheCar();

        PanameraClass porsche = new PanameraClass();
        porsche.model();

        SentraClass ctr = new SentraClass();
        ctr.speed();
    }
}
