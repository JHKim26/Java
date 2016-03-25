public abstract class MusicalInstrument {
    protected String name;
    protected int price;
    protected String brand;

    public MusicalInstrument() {
        name = "";
        price = 0;
        brand = "";
    }

    public MusicalInstrument(String n, int p, String b) {
        name = n;
        price = p;
        brand = b;
    }

    abstract public void play();
}
