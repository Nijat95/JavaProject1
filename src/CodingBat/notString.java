package CodingBat;

public class notString {
    public String notString(String str) {
        String not = "not";
        if(!str.startsWith("not")){
           str = not +" "+ str;
        }

        return str;
    }


    public static void main(String[] args) {
        notString notString = new notString();
        System.out.println( notString.notString("candy"));
    }


}
