package JavaAssignment;

import java.util.Scanner;

public class JavaAssignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String text = sc.nextLine();
        System.out.println("Enter a Character position to find out the letter");
        int character = sc.nextInt();
        System.out.println("Character at position " + character + ": "+ text.charAt(character));
        System.out.println("String length is " + text.length());

    }
}




