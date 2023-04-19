import java.util.Scanner;

public class PracticeClass {
    public static void main(String[] args) {
        // ask user to enter product name and its price
        // after 5 item ask user Q: Y/N
        // if yes : ask for 5 more items
        // if no : stop the program
        // at the end print receipt price next to it
        // total amount at the bottom

      /*  String product = "";
        double price = 0;
        double TotalPrice = 0;
        for (int i = 1; i <= 10 ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a product #" + i + " ");
            product = sc.nextLine();

            System.out.print("Enter the price #" + i + " ");
            price = sc.nextDouble();

            TotalPrice += price;
            System.out.println(product + "..........." + price);

            if(i == 5){
                System.out.println("Do you want to enter more items : Y/N");
                sc.nextLine();
                String answer = sc.nextLine();
                if(answer.equals("Y")) {
                    i = 5;
                }else{
                    break;
                }
            }

        }

        System.out.println("Total price.......... $ " + TotalPrice);

*/
        // ask user to enter a text
        // print a reverted version of the text
        // Hello => olleH
        // use for loop

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text ");
        String text = input.nextLine();

        String reversed = "";
        for( int i =  text.length()-1; i >= 0; i-- ) {
            reversed += text.charAt(i);
        }

        System.out.println(reversed);


    // civic, anna, level, => Palindrome
    // write a java code to check if a string is a Palindrome

    String str1 = "Civic";

    String palindrome1 = "";//
    for(int i = str1.length() - 1; i >= 0; i--) {
        palindrome1 += str1.charAt(i);
    }
    if(str1.toLowerCase().equals(palindrome1.toLowerCase())) {
        System.out.println("This is a Palindrome " + palindrome1 + " : " + str1);
    }else{
        System.out.println("This is not Palindrome " + palindrome1 + " : " + str1);
    }

    for(int i=1; i<= 10; i++){
        for(int j=1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

        for(int i=10; i >= 1; i--){
            for(int j=1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
