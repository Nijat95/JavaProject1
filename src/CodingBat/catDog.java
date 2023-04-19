package CodingBat;

public class catDog {

    public boolean catDog(String str) {
        String result = "";
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length()-2; i++) {
            result = str.substring(i, i + 3);
            if(result.equals("dog")){
                ++dogCount;
            }else if(result.equals("cat")){
                ++catCount;
            }
        }
        return catCount == dogCount;
    }

    public static void main(String[] args) {
        catDog catDog = new catDog();
        System.out.println(catDog.catDog("catdog"));

    }
}
