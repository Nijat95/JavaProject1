public class MovieDirector {
    // instance variables
    String fullName;
    int yob;
    String movieName;


    // instance methods

    //constructor
    public MovieDirector(String name) {
        fullName = name;
    }

    public void createMovies(String name){
        movieName = name;
        System.out.println(fullName + " is directed " + name);
    }

    public void dob (int yob1){
        yob = yob1;
        System.out.println(fullName + " is born in " + yob);
    }

    public static void main(String[] args) {
        MovieDirector director = new MovieDirector("Q. Tarantino");
        director.createMovies("Kill Bill");
        director.dob(1960);


        System.out.println("==================================");
        MovieDirector director2 = new MovieDirector("M.Scorsese");
        director2.createMovies("Wolf of Wall Street");
        director2.dob(1940);


    }


}
