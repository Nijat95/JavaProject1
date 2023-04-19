package OOP.Animal;

public class Animal {
    static String name;
    static int age;
    static String type;
    static String LandOrSea;

    static int sleeptime;


    public static void animalAge(){
        System.out.println("Your animal is " + age + " Years old");
    }
    public static void animalName(){
        System.out.println("Called " + name);
    }
    public static void animalType(String type){
        if(type.contains("Mammal")){
            System.out.println("This animal walks on " + LandOrSea);
        }else if(type.contains("Fish")){
            System.out.println("This animal swims in " + LandOrSea);
        }else{
            System.out.println();
        }
    }
    public static void AnimalSLeeps(){
        System.out.println("This animal sleeps " + sleeptime + " Hours");
    }
    public static void IsNoisy(String noisy){
         if(noisy.contains("True")){
             System.out.println("You have a noisy animal");
         }else{
             System.out.println("You have a quiet animal");
         }
    }

    public static void isWild(String wild){
        if(wild.contains("True")){
            System.out.println("Look out this animal can hurt you");
        }else if(wild.contains("False")){
            System.out.println("You should adopt this animal");
        }else{
            System.out.println();
        }
    }
    }


