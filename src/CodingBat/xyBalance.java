package CodingBat;

public class xyBalance {
    public boolean xyBalance(String str){
        if(str.length() < 2){
                if(str.contains("x")){
                    return false;
                }
                return true;
            }
            for (int i = 0; i < str.length()-1;i++){
                if(str.contains("x") && str.contains("y")  && str.endsWith("y") || !str.contains("x") && !str.contains("y")){
                    return true;
                }
            }
            return false;
        }



    public static void main(String[] args) {
        xyBalance xy = new xyBalance();
        System.out.println(xy.xyBalance("12xabxxydxyxyzz"));
    }
}
