import java.util.Scanner;

public class Ad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SEARCH");
        String userInput = sc.nextLine();

        checkForKeyword(userInput);

    }

    //Head&Shoulder promotion
    //helps clear dandruff


    public static void headAndShouldersAd(){
        System.out.println("********HEAD&SHOULDERS*********");
        System.out.println("89 & of users confirmed the instant result! ");
        System.out.println("The best shampoo - NYT");

    }

    //Iced coffee
    public static void coffeeAd(){
        System.out.println("********ICED COFFEE*********");
        System.out.println("The most refreshing cup of cold brew coffee at Tech Nova");
        System.out.println("As seen Tik Tok #TechNova");
    }

    //iphone 14
    public static void iphone14(){
        System.out.println("***********iphone14*********");
        System.out.println("Iphone 14 - a phone with best features");
        System.out.println("Best camera, new colour, improved design");
    }

    //method that checks for certain keywords that user enters
    // and if there is a match the it sends the ad to the user
    public static void checkForKeyword(String str){
        if(str.contains("dandruff") || str.contains("shampoo") || str.contains("3-in-1") || str.contains("best shampoo") || str.contains("hair")){
            headAndShouldersAd();
        }else if(str.contains("coffee") || str.contains("cold coffee") || str.contains("caffeine") || str.contains("cold brew")){
            coffeeAd();
        }else if(str.contains("iphone") || str.contains("apple") || str.contains("best phone") || str.contains("best camera") || str.contains("new phone")){
            iphone14();
        }else {
            headAndShouldersAd();
            coffeeAd();
            iphone14();
        }


    }


}
