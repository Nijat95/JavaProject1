package CodingBat;

public class missingChar {
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder();

        if(n > 0){
            sb.append(str);
            sb.deleteCharAt(n);
            str = sb.toString();
        }
        return str;
    }


    public static void main(String[] args) {
        missingChar missingChar = new missingChar();
        System.out.println(missingChar.missingChar("kitten",1));

    }
}
