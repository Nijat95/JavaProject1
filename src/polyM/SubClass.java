package polyM;

public class SubClass extends ParentClass{

    @Override
    public void print() {
        System.out.println("Today is warm!");
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.print();
    }
}
