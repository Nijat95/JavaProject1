package polyM;

public class Pets {
    public void play(){
        System.out.println("Pets love playing");
    }
    public void methodA(){

    }
}

class Dog extends Pets{
    public void play(){
        super.play();
        super.methodA();
        System.out.println("Dogs play catch");
    }
}

class GuneaPig extends Pets{
    public void play(){
        System.out.println("GuneaPig play hide and seek");
    }


}
class Demo{
    public static void main(String[] args) {
        Pets p = new Pets();
        p.play();

        Pets dog = new Dog();
        dog.play();

        Pets gp = new GuneaPig();
        gp.play();
    }
}