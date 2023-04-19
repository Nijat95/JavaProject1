package OOP.Encapsulation;

public class Andy {
    public static void main(String[] args) {
        Human human = new Human();
        human.setFull_Name("Andy");
        human.setEmail_Address("andy@gmail.com");
        human.setPhone_Number("12247841144");
        System.out.println(human.getFull_Name());
        System.out.println(human.getEmail_Address());
        System.out.println(human.getPhone_Number());
    }


}
