package PatikaStore;

import java.util.TreeSet;

public class Brands {
    private static TreeSet<Brand> brands;

    static {
        brands = new TreeSet<>();
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Monster"));
    }

    public static TreeSet<Brand> getBrands() {
        return Brands.brands;
    }

    public static Brand getBrandById(int id) {
        for (Brand brand : getBrands()) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }

    public static void addBrand(String brandName) {
        brands.add(new Brand(brandName));
    }

    /*
    Brand silmek şu an için tehlikeli çünkü, bir markaya ait ürünler varsa onları da silmek gerekiyor...

    public static void deleteBrandById(int id) {
        for (Brand brand : getBrands()) {
            if (brand.getId() == id) {
                brands.remove(brand);
            }
        }
    }
     */
}
