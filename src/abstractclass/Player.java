package abstractclass;

public abstract class Player {

    //3 abstract methods
    public abstract void play();

    public abstract void pause();

    public abstract void stop();
}
//Abstract Class 2
abstract class CDPlayer extends Player{

    public abstract void Brand();
}
//concrete class
class Demo extends CDPlayer{

    @Override
    public void play() {
        System.out.println("Click on play button");
    }

    @Override
    public void pause() {
        System.out.println("Click on pause button");
    }

    @Override
    public void stop() {
        System.out.println("Click on stop button");
    }

    @Override
    public void Brand() {
        System.out.println("Marshall is the maker");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.Brand();
        demo.play();
        demo.pause();
        demo.stop();

    }
}