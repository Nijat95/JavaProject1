import java.util.Scanner;

public class SwitchStatementPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char Between A and D");
        char Char = sc.next().charAt(0);
        switch (Char) {
            case 'A':
            case 'a':
                System.out.println("You typed in A");
                break;
                case 'B':
                    case 'b':
                    System.out.println("You typed in B");
                    break;
                    case 'C':
                        case 'c':
                        System.out.println("You typed in C");
                        break;
                        case 'D':
                            case 'd':
                            System.out.println("You typed in D");
                            break;
            default:
                System.out.println("You sure you read the Instructions?");
        }
    }

}
