package CodingBat;

public class front3 {
    public static String front3(String str) {
        String front3 = "";
        int stringLength = 0;
        for (int i = 0; i < str.length(); i++) {
            stringLength++;
            if(stringLength > 3){
                stringLength = 3;
            }
        }
        System.out.println(stringLength);
        if(str.length() > 0){
            front3 = str.substring(0,stringLength);
            front3 = front3 + front3 + front3;
        }

        return front3;
    }


    public static void main(String[] args) {
        System.out.println(front3(""));
    }
}
