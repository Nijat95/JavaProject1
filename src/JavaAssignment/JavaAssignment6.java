package JavaAssignment;

import java.util.Scanner;



public class JavaAssignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = sc.nextLine();

        for (int j = 0; j < word.length(); j++) {
            System.out.print(word.charAt(j));
            System.out.println("||" + j);
        }


        }
    }
