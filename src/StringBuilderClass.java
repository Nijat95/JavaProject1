public class StringBuilderClass {
    public static void main(String[] args) {

        String str = "Text";

        String str2 = new String("Text");

        //SB
        StringBuilder str3 = new StringBuilder("Text");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str.concat(" new Text Added"));
        System.out.println(str3);
        str3.append("Hello");
        System.out.println(str3+ " New Text added");

        StringBuilder sb = new StringBuilder("Tech Nova");

        System.out.println(sb);

        // append()
        System.out.println(sb.append("'s JAVA CLASS"));
        System.out.println(sb + "'s JAVA CLASS");

        // reverse()
        //System.out.println(sb.reverse());

        //System.out.println(sb.replace(1, "a",2, "a"));
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.delete(7, 12));

        StringBuilder sb2 = new StringBuilder("Hello Welcome");

        System.out.println(sb2.insert(5, " and"));

    }
}
