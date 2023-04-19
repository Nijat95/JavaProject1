package JavaAssignment;

import java.util.Scanner;

        class Checking {
        private int accNum;
        private float balance=100;
        float result;

        Checking(int accNum, float balance) {
            this.accNum = accNum;
            this.balance = balance;

        }

        public void deposit(float dep) {

            balance = balance + dep;
            System.out.println("Deposit successful");
            System.out.println("Balance after deposit  = " + balance);
        }

        public int withdraw(float withdraw) {
            if (withdraw > balance){
                System.out.println("your withdraw exceeds limit");
                System.out.println("Balance = " + balance);
                return 0;

            }
            else{
                result= balance-withdraw;
                System.out.println("Withdraw successful");
                System.out.println("Balance after Withdrawal  = " + result );
                return 1;
            }
        }


        public int getAccNum() {
            return accNum;
        }

        public float getBalance() {
            return balance;
        }

        public String toString() {
            return "Account Number with Balance of " + balance + " is :#" + accNum ;
        }

    }
    public class Checking3 {

        private static Checking[] AccInfo;

        private static int numAcc;

        private static Checking[] p;

        static Scanner sc=new Scanner(System.in);

        public static void main(String[] args) {

            System.out.print("Enter the number of checking accounts you want? ");

            numAcc=sc.nextInt();

            getInput();

            sc.close();
        }

        public static void getInput()
        {
            int option=0;
            while(option!=3)
            {
                System.out.print("Please select an option 1 to create, 2 to search balance, and 3 to Exit: ");
                option=sc.nextInt();

                switch(option) {
                    case 1:
                        AccInfo=new Checking[numAcc];
                        AccInfo=create();
                        break;
                    case 2:
                        p=Balancecheck();
                        break;
                    case 3:
                        System.out.println("System Exit Successful");
                        break;
                }
            }
        }

        public static Checking[] create() {
            Checking[] account=new Checking[numAcc];
            for(int i=0;i<numAcc;i++)
            {
                System.out.println("Account "+(i+1));
                System.out.print("Enter the account number: ");
                int accNum=sc.nextInt();
                System.out.print("Enter the balance: ");
                float bal=sc.nextFloat();
                account[i]=new Checking(accNum, bal);
            }
            return account;

        }

        public static Checking[] Balancecheck()
        {
            Checking[] account=null;

            int[] indexes=new int[numAcc];
            if(AccInfo==null)
                System.out.println("No accounts were found!");
            else
            {
                System.out.print("Enter balance to Search: ");
                float balance=sc.nextFloat();
                int AccountsNULL=0;

                for(int i=0;i<numAcc;i++)
                {
                    if(AccInfo[i].getBalance()==balance)
                    {
                        System.out.println("Index of the Account Number is : "+i);
                        System.out.println(AccInfo[i]);
                        System.out.println();
                        indexes[AccountsNULL]=i;
                        AccountsNULL++;
                    }
                }
                if(AccountsNULL==0)
                    System.out.println("No matches found!");
                else
                {
                    account=new Checking[AccountsNULL];
                    for(int i=0;i<AccountsNULL;i++)
                    {
                        account[i]=AccInfo[indexes[i]];
                    }
                }
            }
            return account;
        }
    }

