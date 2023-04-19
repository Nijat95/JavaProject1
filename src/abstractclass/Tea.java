package abstractclass;

public interface Tea {

    public abstract void sort();
    void brand();

}

interface Coffee{

    void type();
    void origin();

}

class Beverges implements Tea, Coffee {

    @Override
    public void sort() {
        System.out.println("Earl Grey");
    }

    @Override
    public void brand() {
        System.out.println("TeaVana");
    }

    @Override
    public void type() {
        System.out.println("Geisha");
    }

    @Override
    public void origin() {

        System.out.println("Colombia");
    }
}
