
import java.util.Scanner;



public class StringPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        //1 way of creating String obj
        String word1 = "Hello";

        //2 way of creating String object by using a new keyboard
        String word2 = new String("World!");

        //concat in practice
        String obj1 = word1 + " " + word2;
        int l = obj1.length();
        System.out.println(l);
        System.out.println(word1.length());
        System.out.println(word2.length());

        //create 2 string objects
        // concatinate those two objects
        // find the length of all 3 objects

        */

        /*
        String obj1 = "Tech", obj2 = "Nova", obj3 = obj1 + obj2;
        int i1 = obj1.length(), i2 = obj2.length(), i3 = obj3.length();
        System.out.println(i1 + ", " + i2 + ", " + i3);

        System.out.println(obj1.charAt(0)); //T
        System.out.println(obj3.charAt(4)); //N

        //create 1 string object "Java is fun"
        // use the length and charAt()) methoods
        */
        /*
        String objc1 = "Java", objct2 = "Is fun", objct3 = objc1 + objct2;
        int in1 = objc1.length(), in2 = objct2.length(), in3 = objct3.length();
        System.out.println("Length of 'Java' is " + in1 + " Characters " + " 'Is Fun' " + in2 + " Characters, and Together " + in3 + " Characters");
        System.out.println(objc1.charAt(2));
        System.out.println(objct2.charAt(3));
        */
       /* System.out.println("Lets find out how many characters are in Supercalifragilisticexpialidocious ");
        String xyz = "Supercalifragilisticexpialidocious";
        int numberOfCharacters = xyz.length();
        int indexOfLastChar = xyz.length() - 1;
        System.out.println("number of characters is " + numberOfCharacters);
        System.out.println("the last index number is " + indexOfLastChar);
        System.out.println(indexOfLastChar);
        */
        /*
        System.out.println("Please enter your name: ");
        String userName = sc.nextLine();

        String fChar = String.valueOf(userName.charAt(0));
        String lChar = String.valueOf(userName.charAt(userName.length()-1));

        if(fChar.equals(lChar)){
            System.out.println(true);
        }else if(!fChar.equals(lChar)){
            System.out.println(false);
        }else{
            System.out.println("Invalid input ");
        }
        */
        /*
        System.out.println("Please Enter UserName1: ");
        String Name1 = sc.nextLine();
        System.out.println("Please Enter UserName2: ");
        String Name2 = sc.nextLine();
        System.out.println("Please Enter UserName3: ");
        String Name3 = sc.nextLine();

        if(Name1.equals(Name2)){
            System.out.println(Name1 + " and " + Name2 + " are namesakes");
        }else if(Name2.equals(Name3)){
            System.out.println(Name2 + " and " + Name3 + " are namesakes");
        }else if(Name1.equals(Name3)) {
            System.out.println(Name1 + " and " + Name3 + " are namesakes");
        }else{
            System.out.println("Invalid Input");
        }
        */
        /*
        String str1 = "Java is fun";

        System.out.println(str1 + " has " + str1.length() + " characters");
        System.out.println(str1.charAt(0) + " is the first character");
        System.out.println(str1.charAt(5) + " is the 5th index");
        System.out.println(str1.charAt(str1.length()-1) + " is the last character");
         */
        //CharAt() methood takes 1 parmeter that is index and returns char
       /* char fletter = str1.charAt(0);
        String fletterStr = String.valueOf(str1.charAt(0));

        int i = 45;
        String str2 = String.valueOf(i);
        System.out.println(i + 5 + str2);

        // 50 45
        */
        /*
        String str1 = "JAva jAVA";
        char fletter = str1.charAt(0);
        String fletterStr = String.valueOf(str1.charAt(0));
        String letter2 = String.valueOf(str1.charAt(1));
        String letter4 = String.valueOf(str1.charAt(3));
        System.out.println(letter2.equalsIgnoreCase(letter4));

        System.out.println(str1.length()); // tells the length of String
        System.out.println(str1.isEmpty()); // tells if there are no characters

        //isEmpty()
        String s1 = " ";
        String s2 = "";
        System.out.println(s1.isEmpty()); //false
        System.out.println(s2.isEmpty()); //true

        //contains()
        String x = "Today is cold";
        String y = "cold";
        System.out.println(x.contains(y)); // true
        System.out.println(y.contains(x)); // false

        String fullName = "Brad Pitt";
        String firstName = "Brad";
        if(fullName.contains(firstName)){
            System.out.println("correct");
        }else{
            System.out.println("incorrect");
        }

        //write a java program that takes user's name
        // and checks wether username contains letter a

        System.out.println("Enter username to check if it contains letter A: ");
        String username = sc.nextLine();
        String a = "a";
        System.out.println(username.contains(a));

        //write a java program by creating a string that holds a number of capital cities
        //and checks whether that string contains Paris

        System.out.println("Enter a Capital City: ");
        String city1 = sc.nextLine();
        System.out.println("Enter a Capital City: ");
        String city2 = sc.nextLine();
        System.out.println("Enter a Capital City: ");
        String city3 = sc.nextLine();
        System.out.println("Enter a Capital City: ");
        String city4 = sc.nextLine();

        String cities = city1 + ", " + city2 + ", " + city3 + ", " + city4;
        String cityName = "Paris";

        if(cities.contains(cityName)){
            System.out.println("contains Paris");
        }else{
            System.out.println("not contains Paris");
        }
        */
        //startsWith()
/*
        String x = "Rome is a capital of Italy";
        String x1 = "R";
        System.out.println(x.startsWith("R")); // True
        System.out.println(x.startsWith("r")); //False
        System.out.println(x.startsWith("Ro")); // True
        System.out.println(x.startsWith("Rome is")); // True
        System.out.println(x.startsWith("capital")); // False

        //endsWith() methood
        System.out.println(x.endsWith("y")); // True
        System.out.println(x.endsWith("Y"));// False
        System.out.println(x.endsWith("Rome"));// False
        System.out.println(x.endsWith("aly"));// True

        System.out.println(x.toLowerCase(Locale.ROOT));
        System.out.println(x.toUpperCase(Locale.ROOT));

 */

  /*      System.out.println("What Fruit would you like to buy?: ");
        String fruit = sc.nextLine();
        System.out.println("What veggie would you like to buy?: ");
        String vegetable = sc.nextLine();

        String Shop1 = "apple, pear, granade, tomato, potato, broccoli";
        String Shop2 = "mango, grapes, mandarin, cabbage, cucumber, celery, shallot";

        if(Shop1.contains(fruit) && Shop1.contains(vegetable)){
            System.out.println("Visit Shop1 to buy these fruits and vegetables ");
        }else if(Shop2.contains(fruit) && Shop2.contains(vegetable)) {
            System.out.println("Visit Shop2 to buy these fruits and vegetables ");
        }else if(!Shop1.contains(fruit) && Shop1.contains(vegetable)) {
            System.out.println("Shop1 doesn't have these fruit but has these vegetables ");
        }else if(Shop1.contains(fruit) && !Shop1.contains(vegetable)) {
            System.out.println("Shop1 has these fruit but doesn't have these vegetables ");
        }else if(Shop2.contains(fruit) && !Shop2.contains(vegetable)) {
            System.out.println("Shop2 has these fruit but doesn't have these vegetables ");
        }else if(!Shop2.contains(fruit) && Shop2.contains(vegetable)) {
            System.out.println("Shop2 doesn't have has these fruit but has these vegetables ");
        }else{
            System.out.println("Invalid Entry");
        }
   */
    /*    String shop1 = "Apple, Pear, Granade, Tomato, Potato, Broccoli";
        String shop2 = "Mango, Grapes, Mandarin, Cabbage, Cucumber, Celery, Shallet";


        System.out.println("What Fruits would you like to buy ");
        String fruit = sc.nextLine();
        System.out.println("What veggie would you like to buy ");
        String veggie = sc.nextLine();

        //user's input modification
       String fruitM = fruit.toLowerCase();
       //users input veggie modification
        String veggieM = veggie.toLowerCase();

        if(shop1.contains(fruitM) && shop1.contains(veggieM)){
            System.out.println("You can buy " + fruit + " and " + veggie +" at Shop1");
        }else if(shop2.contains(fruitM) && shop2.contains(veggieM)){
            System.out.println("You can buy " + fruit + " and " + veggie +" at Shop2");
        }else if(shop1.contains(fruitM) && shop2.contains(veggieM)) {
            System.out.println("You can buy " + fruit + " At Shop1 " + veggie + " at Shop2");
        }else if(shop2.contains(fruitM) && shop2.contains(veggieM)) {
            System.out.println("You can buy " + fruit + " and " + veggie + " at Shop2");

        }else if(shop1.contains(fruitM) || shop2.contains(fruitM) && !shop1.contains(veggieM) || !shop2.contains(veggieM)) {
            System.out.println("You can buy " + fruit + " at Shop1 and Shop 2 " + " but not those vegetabke");

        }


        */
        /*
        //toUpperCase()
        String midWest = "IL, IA, WI, MI, SD, OH, IN, ND, MN";
        String easternStates = "NH, MA, NC, SC, FL, DE";

        System.out.println("To enter state: ");
        String userInput = sc.nextLine();

        String userInputM = userInput.toUpperCase(Locale.ROOT);

        if(midWest.contains(userInputM)){
            System.out.println("User lives in Mid West");
        }else if(easternStates.contains(userInputM)) {
            System.out.println("User lives in Eastern States");
        }
*/

        String str = "TechNova";
        System.out.println(str.indexOf("T")); // index 0
        System.out.println(str.indexOf("t")); // index -1
        System.out.println(str.indexOf("h")); // index 3
        System.out.println(str.indexOf("ch")); // index 2
        System.out.println(str.indexOf("Na")); // index -1


        //lastIndexOf()
        String str1 = "Java is fun";
        System.out.println(str1.indexOf('a')); //1
        System.out.println(str1.lastIndexOf('a')); //3

        String str2 = "aaa AA aa";
        System.out.println(str2.indexOf("A")); // index number 4
        System.out.println(str2.lastIndexOf("A")); // index number 5

        System.out.println(str2.indexOf('a'));     //0
        System.out.println(str2.lastIndexOf('a'));

        //replace()

        String original = "google";
        System.out.println(original.replace("g", "gf")); //gfoogfle

        String x1 = "A B C D E F G";
        System.out.println(x1.replace(" ", ""));

        //"Today is cold" to "Today Java is java cold"

        String J1 = "Today is cold";
        System.out.println(J1.replace(" "," java "));

        String lorem = "Lorem ipsum dolor sit amet. Non nihil et inventore fugit sed nobis explicabo ut officiis dolor a tempora possimus est perferendis quisquam. Qui alias exercitationem sit molestiae dolor vel dolorem fugit ut quos labore. Qui temporibus quasi quo debitis impedit in possimus sint ut molestiae eveniet.";
        System.out.println(lorem.replace("o",""));



        //substring()


        String lorem1 = "Lorem ipsum dolor sit amet. Non nihil et inventore fugit";
        System.out.println(lorem1.substring(10));
        System.out.println(lorem1.substring(20));

        // with 2 params
        System.out.println(lorem.substring(0, 5));
        int LastIndex = lorem1.length()-1;
        System.out.println(lorem.substring(12, LastIndex));


    }







}
