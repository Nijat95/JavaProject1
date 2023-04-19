package abstractclass;

abstract class ClassA{

    String name;
    String action;

    public ClassA(String namE, String actioN) {
        name = namE;
        action = actioN;
    }

    public void actionMethod(){
        System.out.println(action);
    }
    public abstract void performance();

}

public class ClassB extends ClassA{
    public static void main(String[] args) {
        ClassB classB = new ClassB("Bob", "FLies");
        classB.actionMethod();
    }
    public ClassB(String namE, String actioN) {
        super(namE, actioN);
    }

    @Override
    public void performance() {
        System.out.println("Implementing abstract method in the subclass");
    }

}
