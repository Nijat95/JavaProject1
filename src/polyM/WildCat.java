package polyM;

public class WildCat {
    public void run(){
        System.out.println("wild cats can run fast");
    }
}


class Tiger extends WildCat{
    public void run(){
        System.out.println("Tigers can run fast");
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.run();
    }

}