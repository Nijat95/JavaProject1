import java.util.Scanner;

public class StringBuilderReview {

    public static void main(String[] args) {

        String str2 = new String("Hello World");
        StringBuilder str = new StringBuilder("Hello World");

        System.out.println(str + " 2023");
        System.out.println(str.append(" 2023"));

        System.out.println(str);

        // reverse()
        System.out.println(str.reverse());

        //
        String text = "Hello"; // -> olleH

        StringBuilder newText = new StringBuilder(text);

        System.out.println(text);
        System.out.println(newText);

        String rText = newText.reverse().toString();

        System.out.println(text);
        System.out.println(newText);
        System.out.println(rText);

        //ask user to enter a text
        // print reverse() version of text & make all uppercase
       /*
        System.out.println("Please enter a text");
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        StringBuilder newText1 = new StringBuilder(text1);
        String rBuilder1 = newText1.reverse().toString().toUpperCase();
        System.out.println(rBuilder1);

         */
        StringBuilder str3 = new StringBuilder("Java is FUN!");
        str3.deleteCharAt(11);
        str3.deleteCharAt(0);
        System.out.println(str3);
        System.out.println(str3.delete(5, 7));
        System.out.println(str3.insert(5, " really"));
        System.out.println(str3.insert(0, "#"));






    }
}
