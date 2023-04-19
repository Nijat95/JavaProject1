public class Practice {
    public static void main(String[] args) {
        String halloWold = "Hallo Wold";
        System.out.println("Hallo WOLD");

        String randomString = "";
        for(int i = 0; i < halloWold.length(); i++) {
            randomString += halloWold + " E ";
            randomString += halloWold + " R ";
        }
        System.out.println(randomString);
    }
}
