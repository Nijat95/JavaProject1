import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MyPet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet p = new Pet();
        System.out.println("Do you have a cat or dog? ");
        String pet = sc.nextLine().toLowerCase();

        p.eats(pet);
        p.petSounds(pet);
        p.petBehavior(pet);

    }

}


