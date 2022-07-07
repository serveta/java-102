package PatikaStore;

public class Notebook extends Product {
    private int ram;
    private int ssd;
    private int screenSize;
    public Notebook(String title, Brand brand, int price, int stock, int discount, int ram, int ssd, int screenSize) {
        super(title, brand, price, stock, discount);
        this.ram = ram;
        this.ssd = ssd;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public int compareTo(Product o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
