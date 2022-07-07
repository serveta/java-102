package PatikaStore;

import java.util.TreeSet;

public class Notebooks {
    private static TreeSet<Notebook> notebooks;

    static {
        notebooks = new TreeSet<>();
        notebooks.add(new Notebook("Lenovo Legion S7 15ACH6 82K80030GE", Brands.getBrandById(101), 4500, 50, 5, 8, 512, 14));
        notebooks.add(new Notebook("HP ZBook Fury 17 G8-4A6A9EA", Brands.getBrandById(106), 9500, 20, 15, 8, 512, 17));
        notebooks.add(new Notebook("Apple MacBook Pro 14", Brands.getBrandById(102), 19300, 10, 10, 16, 256, 13));
    }

    public static TreeSet<Notebook> getNotebooks() {
        return Notebooks.notebooks;
    }

    public static void addNotebook(String title, Brand brand, int price, int stock, int discount, int ram, int ssd, int screenSize) {
        notebooks.add(new Notebook(title,brand,price,stock,discount,ram,ssd,screenSize));
    }

    public static void removeNotebook(int id) {
        for (Notebook notebook : notebooks) {
            if (notebook.getId() == id) {
                notebooks.remove(notebook);
                break;
            }
        }
    }
}
