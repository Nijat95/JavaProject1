package CollectionFrameWorks;

public class UsefulMethods {

    public static String convertStringToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String reveredString(String str) {
        String reveredString = "";
        for(int i = str.length(); i > 0; i--){
            reveredString += str.charAt(i);
        }
        return reveredString;
    }
}


