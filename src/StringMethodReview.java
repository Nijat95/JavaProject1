public class StringMethodReview {

    public static void main(String[] args) {
        // charAT()

        String text = "Monday"; // 0M, 1o, 2n, 3d
        System.out.println(text.charAt(3));

        // equals()
        String s1 = "Welcome";
        String s2 = "Welcome";
        System.out.println(s1.equals(s2));


        // subtring()
        String text2 = "Monday";
        System.out.println(text2.substring(3));

        String text3 = "Hello Monday;";
        System.out.println(text3.substring(6));

        System.out.println(text3.substring(6, 9));
        System.out.println(text.substring(4, 5));
        System.out.println(text2.substring(0, 5));
        System.out.println(text3.substring(9, 12));

        // Trim ()

        String text4 = "     Hello & Welcome to a New Java Class     !     ";
        System.out.println(text4);
        System.out.println(text4.trim());

        // compareTo()

        String str1 = "a";
        String str2 = "1";

        System.out.println(str1.compareTo(str2));

        String out = "<<>>";
        String word = "Hello";
        System.out.println(out.replace("<>","<WoHoo>" ));


    }
}
