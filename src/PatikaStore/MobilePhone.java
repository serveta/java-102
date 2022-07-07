package PatikaStore;

public class MobilePhone extends Product {
    private int storage;
    private int battery;
    private int ram;
    private int screenSize;
    private String color;

    public MobilePhone(String title, Brand brand, int price, int stock, int discount, int storage, int battery, int ram, int screenSize, String color) {
        super(title, brand, price, stock, discount);
        this.storage = storage;
        this.battery = battery;
        this.ram = ram;
        this.screenSize = screenSize;
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public int getBattery() {
        return battery;
    }

    public int getRam() {
        return ram;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Product o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
