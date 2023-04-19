package abstractclass;

public abstract class Car {
    private String make;
    private String model;
    private String year;
    private String VIN;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public abstract void starting();
    public abstract void driving();
    public abstract void stopping();
    public abstract void parking();


    }
class Toyota extends Car {

    @Override
    public void starting() {
        System.out.println("Toyota Started");
    }

    @Override
    public void driving() {
        System.out.println("Toyota Driving");
    }

    @Override
    public void stopping() {
        System.out.println("Toyota Stopping");
    }

    @Override
    public void parking() {
        System.out.println("Toyota Parking");
    }

    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.starting();
        toyota.driving();
        toyota.stopping();
        toyota.parking();
        toyota.setMake("Toyota");
        toyota.setModel("Camry");
        toyota.setYear("1999");
        toyota.setVIN("1ZE3YI45-775T3");
        System.out.println(toyota.getMake());
        System.out.println(toyota.getModel());
        System.out.println(toyota.getYear());
        System.out.println(toyota.getVIN());



    }
}


