package abstractclass;

public abstract class Animal {
    public String getName() {
        return name;
    }

    // instance vars
    private String name;

    public Animal(String animalName) {
        name = animalName;
    }

    public abstract void eats();

    public abstract void skill();

    // create a concrete class that extends Animal class
    // implement the abstract methpds



}
