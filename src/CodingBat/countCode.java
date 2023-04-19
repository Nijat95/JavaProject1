package CodingBat;

public class countCode {
   public int countCode(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            result = str.substring(i ,i + 4);
            if(result.startsWith("co") && result.endsWith("e")) {
                ++count;
            }

    }
       return count;
    }

    public static void main(String[] args) {
        countCode count = new countCode();
        System.out.println(count.countCode("codexxcooecode"));
    }
}
