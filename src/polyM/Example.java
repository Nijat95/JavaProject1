package polyM;

public class Example{

    public void today(){
        System.out.println("Saturday");
    }

}

class SubExample extends Example {
    @Override
    public void today(){
        System.out.println("NO today is sunday");
    }
    public static void main(String[] args) {
        SubExample se = new SubExample();
        se.today();
    }
}
