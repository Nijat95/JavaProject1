package OOP.Encapsulation;

public class Person {

    private String name;

    public String getFull_Name() {
        return Full_Name;
    }

    public void setFull_Name(String full_Name) {
        Full_Name = full_Name;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public void setEmail_Address(String email_Address) {
        Email_Address = email_Address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    private String Full_Name;
    private String Email_Address;
    private String Phone_Number;


    private long SSN;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        String ssn = String.valueOf(SSN);
        if (ssn.length() == 9){
            this.SSN = SSN;
        }else{
            System.out.println("Invalid SSN");
        }
    }

    public int getAge() {
        if(this.age > 18){
            return age;
        }else{
            return 0;
        }

    }

    public void setAge(int age) {
        if(age>18){
            this.age = age;
        }else{
            System.out.println("You are not old enough");
        }

    }



}
