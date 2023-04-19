package technovalFlex;

public class MovieTeka {

    //Features
    // 1. user should be able to login to the app
    // username and password - variables, secure (access modifier)
    // 2. app should store movies
    // array

    // 3. app should display all available movies
    // 4. user should be able to search Movies based on Category

    private String userName = "Nijat1", password = "Nismo@101";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

// movieName, releaseYear, genre, director, mainCast

    String [][] movies = {
            {"Don't worry Darling", "2022", "thriller", "Olivia Wilde", "HarryStyles"},
            {"Titanic", "1997","drama","James Cameron", "Katie Winslet"},
            {"Home Alone", "1990", "comedy", "Chris Columbus","Macaullay Culkin"},
            {"Django", "2012","Western","Q. Tarantino","Christopher Waltz"},
            {"Scream", "1993","horror", "Wase Craven", "Aaron Crueger"},
    };


}
