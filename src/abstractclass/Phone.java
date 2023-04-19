package abstractclass;

public interface Phone {

    public static void text(String text){
        System.out.println(text);
    }
    public static void call(String call){
        System.out.println(call);
    }
    public static void ring(String ring){
        System.out.println(ring);
    }
    class iPhone implements Phone {
        public static void main(String[] args) {
            text("Hello, world!");
            call("Hello, TechNova!");
            ring("RingRing");
        }
    }
}
