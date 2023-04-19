package abstractclass;

public abstract class Bird extends Animal {

    public Bird(String animalName){
        super(animalName);
    }

    public void eats() {
        System.out.println("Bird eat seeds");
    }

    public void skill() {
        System.out.println("Bird can sing");
    }

    public abstract void fly();



}

class Eagle extends Bird{

    public Eagle(String animalName) {
        super(animalName);
    }

    @Override
    public void fly() {
        System.out.println("Eagles can fly fast");
    }

    public static void main(String[] args) {
        Eagle eagle = new Eagle("Bald Eagle");
        eagle.fly();
        eagle.eats();
        eagle.skill();
    }

}
