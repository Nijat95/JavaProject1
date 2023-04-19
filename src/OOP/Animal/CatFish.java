package OOP.Animal;

public class CatFish extends Animal{
    public static void main(String[] args) {
        type = "Catfish";
        name = "Michael";
        age = 4;
        LandOrSea = "Sea";
        sleeptime = 8;
        System.out.println(type);
        AnimalSLeeps();
        animalAge();
        animalName();
        animalType("Fish");
        isWild("True");
        IsNoisy("false");
    }
}
