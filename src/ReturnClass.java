public class ReturnClass {
    public static void main(String[] args) {
        //here

        int number1 = 10;
        int number2 = 10;
        int result = number1 + number2;
        System.out.println(result);

        // calling method
       int result2 = calculate(number1, number2);
        System.out.println(result2);
        int result3 = calculate(30, 50);
        System.out.println(result2);
        System.out.println(result3);

        int maxNumber = max(70, 50);
        System.out.println(maxNumber);

        printName("John Doe");

        myInfo("John", "Smith", 33);
        myInfo("Adam", "Smith", 12);

        String result4 = startWord("hippo", "zip");
        int result5 = findTheMax(12, 44, 8);
        System.out.println(result5);
    }

    //here
    public static int calculate(int x, int y){
        return x + y;
    }

    public static int max(int x, int y){
        if(x > y){
            return x;
        }else{
            return y;
        }
    }

    public static void printName(String name){
        System.out.println(name);
    }

    // create a method with no return type
    // has 3 parameters: String firstName, String LastName, int age
    // print : First Name is : Last Name is : age:

    public static void myInfo(String firstName, String lastName, int age) {
        System.out.println("First name is : " + firstName + ", Last name is : " + lastName + ", age is : " + age);
    }



    public static String startWord(String str, String word) {
         if(word.length() == 1 && str.length() > 0){
            return str.substring(0, 1);
        }
        if(word.length() > 1 && word.length() <= str.length() && word.substring(1).equals(str.substring(1, word.length()))){
            return str.substring(0, 1) + word.substring(1);
        }
        return "";
    }

    //create a method with 3 param int : int x, y, z
    // find out which int is the largest
    // return type must be in

    public static int findTheMax(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else{
            return z;
        }
        }

    }





