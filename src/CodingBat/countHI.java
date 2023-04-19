package CodingBat;

public class countHI {
    public int countHi(String str) {
        String result = "";
        int hiCount = 0;
        for(int i=0; i<str.length()-1; i++){
            result = str.substring(i, i+2);
            if(result.equals("hi")){
            hiCount++;
            }
        }
        return hiCount;
    }

    public static void main(String[] args) {
        countHI count = new countHI();
        System.out.println(count.countHi("hi hi hi hi si fi hi"));
    }

}
