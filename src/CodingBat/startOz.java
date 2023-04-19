package CodingBat;

public class startOz {
    public static String startOz(String str) {
        if(str == null) return str;
        if(str.startsWith("oz")) {
            return "oz";
        }else if(str.startsWith("o")){
            return "o";
        }else if(str.startsWith("z",1)){
            return "z";
        }else if(!str.contains("oz")){
            return "";
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
    }
}
