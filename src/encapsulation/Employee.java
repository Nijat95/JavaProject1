package encapsulation;

public class Employee {
    private int salary;
    private String department;
    private String bankAccountNumber;
    private String fullName;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }



   public String getFullName(){
       return fullName;
   }

   public void setFullName(String name){
       fullName = name;
   }

}
