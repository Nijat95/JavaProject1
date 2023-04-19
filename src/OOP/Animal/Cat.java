package OOP.Animal;

public class Cat extends Animal{
    public static void main(String[] args) {
        type = "Cat";
        name = "Pikachu";
        age = 3;
        LandOrSea = "Land";
        sleeptime = 16;
        System.out.println(type);
        Animal.AnimalSLeeps();
        Animal.animalAge();
        Animal.animalName();
        Animal.animalType("Mammal");
        Animal.IsNoisy("False");
        Animal.isWild("False");


    }
}
