public class Pet {
    // non-static and void methods
    public void eats(String petType){
        if(petType.contains("dog")){
            System.out.println("Dog eats Pedigree");
        }else if(petType.contains("cat")){
            System.out.println("Cat eats Sheba");
        }
    }
    public void petSounds(String petType){
        if(petType.contains("dog")){
            System.out.println("Woof - Woof");
        }else if(petType.contains("cat")){
            System.out.println("Meow - meow");
        }
    }

    public void petBehavior(String petType){
        if(petType.contains("dog")){
            System.out.println("Dog Runs after the ball and brings it back");
        }else if(petType.contains("cat")){
            System.out.println("Cat runs around the table");
        }
    }


    // Describe how dogs or cats play
    // make nob static or void

}
