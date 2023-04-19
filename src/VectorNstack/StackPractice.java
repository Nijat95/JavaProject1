package VectorNstack;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
        Stack<String> names = new Stack();

        names.push("Jenya");
        names.push("Olha");
        names.push("Aida");
        names.push("Fay");
        names.push("Aiko");
        System.out.println(names.peek());

        String removedName = names.pop(); // Last in First Out -> LIFO
        System.out.println("Removed name is " + removedName);
        System.out.println(names);

        System.out.println(names.search("Fay") + " is the position of Fay");
        System.out.println(names.search("Aida") + " is the position of Aida");

    }
}
