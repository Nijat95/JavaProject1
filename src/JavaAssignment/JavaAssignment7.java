package JavaAssignment;

import java.util.Scanner;

public class JavaAssignment7 {
    static int AccNum;
    float Balance = 100.00f;

    public void deposit(float DepositAmount){
        this.Balance = DepositAmount + this.Balance;
    }
    public int Withdraw(float WithdrawAmount){
        if(WithdrawAmount > this.Balance){
            return 0;

        }else {
            this.Balance = this.Balance - WithdrawAmount;
            this.Balance = (int)this.Balance;
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaAssignment7 JavaAssignment7 = new JavaAssignment7();
        System.out.println("Hello! Welcome to the Bank!");
        System.out.println("What would you like to do today?");
        String answer = sc.next().toLowerCase();
        if(answer.toLowerCase().contains("deposit")){
            System.out.print("Please enter the amount you would like to deposit: $");
            float DepositAmount = sc.nextFloat();
            JavaAssignment7.deposit(DepositAmount);
            System.out.println("Deposit successful");
            System.out.println("New Balance is: $" + JavaAssignment7.Balance);
            System.out.println("Have a Nice Day!");
        }else if(answer.toLowerCase().contains("withdraw")){
            System.out.print("Please enter the amount you would like to withdraw: $");
                float WithdrawAmount = sc.nextFloat();
                AccNum = JavaAssignment7.Withdraw(WithdrawAmount);
                float ExceedsBY = WithdrawAmount - JavaAssignment7.Balance;
                if(AccNum == 0){
                    System.out.println("Your withdraw exceeds limit by $" + ExceedsBY);
                    System.out.println("Your current balance is: $" + JavaAssignment7.Balance);

               }else{
                    System.out.println("Withdrawal Successful");
                  System.out.println("New Balance is: $" + JavaAssignment7.Balance);
                    System.out.println("Have a Nice Day!");
                }



        }else{
            System.out.println("Invalid input");
        }
    }
}
