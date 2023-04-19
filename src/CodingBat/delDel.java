package CodingBat;

public class delDel {
    public static String delDel(String str) {
        String del = "del";
        if(str.contains(del) && str.startsWith(del,1) && str.endsWith(del)) {
            str = str.charAt(0) + str.substring(4);
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(delDel("adel"));
    }
}
