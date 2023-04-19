public class Animals {
    // instance variables
    boolean isPredator;
    String species;
    boolean isWild;
    boolean isPet;
    boolean canFly;
    int speed;

    public void run(){
        System.out.println("It can run up to " + speed + "mp/h");
    }
    public void eats(){
        if(isPredator){
            System.out.println("They Eat meat");
        }else{
            System.out.println("They Eat dont eat meat");
        }
    }

    public void type (){
        if(isWild){
            System.out.println("It is a wild animal");
        }else {
            System.out.println("It is not a wild animal");
        }
    }

    public static void main(String[] args) {
        Animals tiger = new Animals();

        tiger.speed = 40;
        tiger.isPredator = true;
        tiger.isWild = false;
        tiger.canFly = false;
        tiger.isPet = false;
        tiger.eats();
        tiger.type();
        tiger.run();


        System.out.println("-------------------------------------------");
        Animals panda = new Animals();
        panda.isWild = false;
        panda.isPet = false;
        panda.canFly = false;
        panda.speed = 20;
        panda.eats();
        panda.run();
        panda.type();
    }
}
