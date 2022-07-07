package PatikaStore;

public abstract class Product implements Comparable<Product> {
    private static int uniqueId = 1216;
    private int id;
    private String title;
    private Brand brand;
    private int price;
    private int stock;
    private int discount;

    public Product(String title, Brand brand, int price, int stock, int discount) {
        this.id = uniqueId++;
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getDiscount() {
        return discount;
    }
}
