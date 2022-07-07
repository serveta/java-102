package PatikaStore;

import java.util.Scanner;

public class Management {
    private static Scanner input = new Scanner(System.in);

    public static void run() {
        int selected;

        while (true) {
            selected = -1;
            while (selected < 0 || selected > 4) {
                System.out.println("PatikaStore product management system!");
                System.out.println("1- Notebooks");
                System.out.println("2- Mobile Phones");
                System.out.println("3- Brands");
                System.out.println("4- Exit");
                System.out.print(" * Select: ");
                selected = input.nextInt();
            }

            if (selected == 1) {
                printNotebooks();
                notebookMenu();
            } else if (selected == 2) {
                printMobilePhones();
                mobilePhoneMenu();
            } else if (selected == 3) {
                printBrands();
                brandMenu();
            } else if (selected == 4) {
                System.out.println(" * The program has been terminated!");
                break;
            }
        }
    }

    public static void printBrands() {
        System.out.println("Brands");
        System.out.println("-------");
        for (Brand brand : Brands.getBrands()) {
            System.out.println("- " + brand.getName());
        }
    }

    public static void brandMenu() {
        int selected = -1;
        System.out.println("* Brand Menu:");
        while (selected < 0 || selected > 1) {
            System.out.println("1- Add new brand");
            System.out.println("0- Return main menu");
            System.out.print(" * Select: ");
            selected = input.nextInt();
            if (selected == 1) {
                System.out.print("Brand name: ");
                String newBrand = input.next();
                Brands.addBrand(newBrand);
                printBrands();
            }
        }
    }

    public static void printNotebooks() {
        String stringFormat = "| %-2d | %.15s | %-9s | %-9d | %-9d | %-9d | %-8d  | %-8d | %-11d |%n";
        String line = "+-------------------------------------------------------------------------------------------------------------+%n";

        System.out.format(line);
        System.out.format("| ID   | Title           | Brand     | Price     | Stock     | Discount  | RAM       | SSD      | Screen Size |%n");
        System.out.format(line);
        for (Notebook notebook : Notebooks.getNotebooks()) {
            System.out.format(stringFormat, notebook.getId(), notebook.getTitle(), notebook.getBrand().getName(), notebook.getPrice(), notebook.getStock(), notebook.getDiscount(), notebook.getRam(), notebook.getSsd(), notebook.getScreenSize());
        }
        System.out.format(line);
    }

    public static void notebookMenu() {
        int selected = -1;
        System.out.println("* Notebook Menu:");
        while (selected < 0 || selected > 2) {
            System.out.println("1- Add new notebook");
            System.out.println("2- Remove a notebook");
            System.out.println("0- Return main menu");
            System.out.print(" * Select: ");
            selected = input.nextInt();
            if (selected == 1) {
                System.out.print("Title: ");
                input.nextLine();
                String title = input.nextLine();
                System.out.print("Brand ID: ");
                int brandId = input.nextInt();
                Brand brand = Brands.getBrandById(brandId);
                System.out.print("Price: ");
                int price = input.nextInt();
                System.out.print("Stock: ");
                int stock = input.nextInt();
                System.out.print("Discount: ");
                int discount = input.nextInt();
                System.out.print("Ram: ");
                int ram = input.nextInt();
                System.out.print("SSD: ");
                int ssd = input.nextInt();
                System.out.print("Screen size: ");
                int screenSzie = input.nextInt();

                Notebooks.addNotebook(title, brand, price, stock, discount, ram, ssd, screenSzie);
            } else if (selected == 2) {
                System.out.print("Notebook ID: ");
                Notebooks.removeNotebook(input.nextInt());
            }

            printNotebooks();
        }
    }

    public static void printMobilePhones() {
        String stringFormat = "| %-2d | %.9s | %-9s | %-6d TL | %-9d | %-9d | %-6d GB | %-13d | %-8d mAh | %-11d inc | %-10.10s |%n";
        String line = "+--------------------------------------------------------------------------------------------------------------------------------------------+%n";

        System.out.format(line);
        System.out.format("| ID   | Title     | Brand     | Price     | Stock     | Discount  | RAM       | Storage       | Battery      | Screen Size     | Color      |%n");
        System.out.format(line);
        for (MobilePhone mobilePhone : MobilePhones.getMobilePhones()) {
            System.out.format(stringFormat,mobilePhone.getId(), mobilePhone.getTitle(), mobilePhone.getBrand().getName(), mobilePhone.getPrice(),mobilePhone.getStock(),mobilePhone.getDiscount(),mobilePhone.getRam(),mobilePhone.getStorage(),mobilePhone.getBattery(),mobilePhone.getScreenSize(),mobilePhone.getColor());
        }
        System.out.format(line);
    }

    public static void mobilePhoneMenu() {
        int selected = -1;
        System.out.println("* Mobile Phone Menu:");
        while (selected < 0 || selected > 2) {
            System.out.println("1- Add new mobile phone");
            System.out.println("2- Remove a mobile phone");
            System.out.println("0- Return main menu");
            System.out.print(" * Select: ");
            selected = input.nextInt();
            if (selected == 1) {
                System.out.print("Title: ");
                input.nextLine();
                String title = input.nextLine();
                System.out.print("Brand ID: ");
                int brandId = input.nextInt();
                Brand brand = Brands.getBrandById(brandId);
                System.out.print("Price: ");
                int price = input.nextInt();
                System.out.print("Stock: ");
                int stock = input.nextInt();
                System.out.print("Discount: ");
                int discount = input.nextInt();
                System.out.print("Storage: ");
                int storage = input.nextInt();
                System.out.print("Battery: ");
                int battery = input.nextInt();
                System.out.print("Ram: ");
                int ram = input.nextInt();
                System.out.print("Screen Size: ");
                int screenSize = input.nextInt();
                System.out.print("Color: ");
                input.nextLine();
                String color = input.nextLine();

                MobilePhones.addMobilePhone(title, brand, price, stock, discount, storage, battery, ram, screenSize, color);
            } else if (selected == 2) {
                System.out.print("Mobile Phone ID: ");
                MobilePhones.removeMobilePhone(input.nextInt());
            }

            printMobilePhones();
        }
    }
}
