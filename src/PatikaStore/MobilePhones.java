package PatikaStore;

import java.util.TreeSet;

public class MobilePhones {
    private static TreeSet<MobilePhone> mobilePhones;

    static {
        mobilePhones = new TreeSet<>();
        mobilePhones.add(new MobilePhone("Iphone 12 64 GB", Brands.getBrandById(102), 10359, 22, 3, 64, 3000, 6, 6, "Space Gray"));
        mobilePhones.add(new MobilePhone("Lenovo O-2", Brands.getBrandById(101), 6359, 3, 6, 128, 4000, 3, 5, "Black"));
    }

    public static TreeSet<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }

    public static void addMobilePhone(String title, Brand brand, int price, int stock, int discount, int storage, int battery, int ram, int screenSize, String color) {
        mobilePhones.add(new MobilePhone(title, brand, price, stock, discount, storage, battery, ram, screenSize, color));
    }

    public static void removeMobilePhone(int id) {
        for (MobilePhone mobilePhone : mobilePhones) {
            if (mobilePhone.getId() == id) {
                mobilePhones.remove(mobilePhone);
                break;
            }
        }
    }
}
