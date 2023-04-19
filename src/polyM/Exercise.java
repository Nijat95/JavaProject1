package polyM;

public class Exercise {
    public void play(){
        System.out.println("The athlete is running");
    }
}
class TennisPlayer extends Exercise{
    public void play(){
        System.out.println("The Tennis Player has striked the tennis ball");
    }
}

class SoccerPlayer extends Exercise{
    public void play(){
        System.out.println("The Soccer Player is dribbling the ball through the soccer field");
    }
}

class Competition{
    public static void main(String[] args) {
        Exercise e = new Exercise();
        e.play();
        Exercise player = new TennisPlayer();
        player.play();
        Exercise ex = new SoccerPlayer();
        ex.play();

    }
}
