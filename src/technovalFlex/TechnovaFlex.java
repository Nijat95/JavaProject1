package technovalFlex;

import java.util.Arrays;
import java.util.Scanner;

public class TechnovaFlex {

    MovieTeka mt = new MovieTeka();


    public void Application(){
        TechnovaFlex tf = new TechnovaFlex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter username: ");
        String un = sc.nextLine();
        System.out.println("Please enter password: ");
        String pwd = sc.nextLine();
        if(un.equals(mt.getUserName()) && pwd.equals(mt.getPassword())){
            System.out.println("\nLogin Successful\n");
            tf.menu();
            String option = sc.nextLine();
            do{
            switch(option){
                case "1":
                    tf.displayAll();
                    break;
                    case "2":
                        System.out.print("Please enter the movie Genres ");
                        String genre = sc.nextLine();
                        tf.searchByGenre(genre);
                        break;
                        case "3":
                            System.out.println("Please Enter movie Year:");
                            String Movieyear = sc.nextLine();
                            tf.searchByYear(Movieyear);
                            break;
                            case "4":
                                System.out.println("Thank you for using our application");
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
            }}while(!option.equals("4"));
        }else{
            System.out.println("\nLogin Unsuccessful\n");
            System.exit(0);
        }
    }

    public void displayAll(){
        for(int i = 0; i < mt.movies.length; i++){
            for(int j = 0; j < mt.movies.length; j++){
                System.out.println(Arrays.toString(mt.movies[i]));
            }
        }
    }

    public void searchByYear(String year){

        for(int i = 0; i < mt.movies.length; i++){
           if(mt.movies[i][1].equals(year)){
               System.out.println(Arrays.toString(mt.movies[i]));
               String arrayStr = Arrays.toString(mt.movies[i]);
               String MovieName = arrayStr.substring(1,arrayStr.indexOf(","));
               System.out.println(MovieName);
           }
        }

    }
    // create a method that takes one parameter which is genre
    // print out the movie that matches that genre

    public void searchByGenre(String genre){
        for(int i = 0; i < mt.movies.length; i++){
            if(mt.movies[i][2].equals(genre)){
                String arrayStr = Arrays.toString(mt.movies[i]);
                String MovieName = arrayStr.substring(1,arrayStr.indexOf(","));
                System.out.println(MovieName);
            }
        }
    }


    public void menu(){
        System.out.println("1. To display all movies");
        System.out.println("2. Search by genre:");
        System.out.println("3. Search by year:");
        System.out.println("4. Exit Program");
        System.out.println("Please enter menu number: ");
    }

    public static void main(String[] args) {
        TechnovaFlex flex = new TechnovaFlex();
        flex.Application();
        //flex.displayAll();
        //flex.searchByYear("2012");
        //flex.searchByGenre("horror");
    }

}
