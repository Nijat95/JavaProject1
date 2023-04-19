package OOP.Iheritance.MyApp;

public class HomePage extends LoginPage{

    public static void main(String[] args) {
        HomePage.userName = "Admin";
        HomePage.password = "Admin123";
        HomePage.loginButton = "LoginButton";

        System.out.println(userName);
        System.out.println(password);
        System.out.println(loginButton);
    }

    HomePage(String username,String password){
        super(username,password);
    }

}
