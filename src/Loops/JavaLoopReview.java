package Loops;

import java.util.Scanner;

public class JavaLoopReview {
    public static void main(String[] args) {

        int i = 1;

        while(i <= 10){

            System.out.println(i + " Java");
            i++;
        }

        i = 1;
        do{
            System.out.println(i + " DO while => Java");
            i++;
        }while(i <= 10);



        for(i = 1; i <= 10; i++) {
            System.out.println(i + " for loop => Java");
        }


        // ask user to enter a word
        // write java prog to find out if the word entered by user hasa vowel
        // a, i, u, o, e => consider upper case & lower case chars

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        String vowel = " ";

        for (int v = 0; v < word.length(); v++) {

            if(word.charAt(v) == 'a' || word.charAt(v) == 'e'|| word.charAt(v) == 'u' || word.charAt(v) == 'i' || word.charAt(v) == 'o' ) {
                vowel += word.charAt(v);
                System.out.println(v + " : " + word.charAt(v));
            }

        }

        // how to find out : how many vowels & const are in a give sentence
        int vowelCount = 0;
        int constCount = 0;

        for( int v = 0; v < word.length(); v++ ) {
            if(word.charAt(v) == 'a' ||
                    word.charAt(v) == 'e' ||
                    word.charAt(v) == 'u' ||
                    word.charAt(v) == 'i' ||
                    word.charAt(v) == 'o' ) {

                vowelCount++;

            }else{
                constCount++;
            }

        }
        System.out.println("Vowel count is : " + vowelCount);
        System.out.println("Vowel count is : " + constCount);


        // print alphabet using for loop A - Z

        int z = 97;
        for ( int c = 'A'; c <= 'Z'; c++) {
            char b = (char) c;
            char d = (char) z;
            System.out.print(b+""+ d + " ,");
            z++;

        }

        //Aa, Bb, Cc, ...

        System.out.println("\n");
        for (int j = 65; j <= 90; j++) {
            char alphabet = (char) j;
            System.out.println(" ASCII Table Value: "+ j +" char:" + alphabet + ",");
        }

    }

}
