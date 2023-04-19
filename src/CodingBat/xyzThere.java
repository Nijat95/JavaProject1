package CodingBat;

public class xyzThere {

    public boolean xyzThere(String str){
        String result = "";
        for(int i=0; i<str.length()-3; i++){
            result = str.substring(i,i+4);
            if(!result.startsWith(".") && result.endsWith("xyz") ){
                return true;
            }
        }
        return result.contains("xyz");
    }

    public static void main(String[] args) {
        xyzThere xyz = new xyzThere();
        System.out.println(xyz.xyzThere("x.xyzabc"));
    }
}
