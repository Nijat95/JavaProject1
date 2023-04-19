package OOP.Animal;

public class Bear extends Animal {
    public static void main(String[] args) {
        type = "Bear";
        name = "Oberon";
        age = 13;
        LandOrSea = "Land";
        sleeptime = 4;
        System.out.println(type);
        AnimalSLeeps();
        animalAge();
        animalName();
        animalType("Mammal");
        isWild("True");
        IsNoisy("True");

    }
}
