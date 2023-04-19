package encapsulation;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFullName("Angelina Jolie");
        System.out.println(employee.getFullName());

        employee.setBankAccountNumber("12345");
        System.out.println(employee.getBankAccountNumber());
        employee.setSalary(50);
        System.out.println(employee.getSalary());

        //a class with 3 attributes (private acess modifier) and create getters and setters
        // create another class to set values to those attributes and print out those values
    }
}
