package OOP.Encapsulation;

public class John {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(32);
        person.setSSN(666541588);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSSN());
    }
}
