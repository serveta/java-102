package ListClass;

public class App {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<>();

        System.out.println("Dizideki elemanlar : " + listInt.toString());
        System.out.println("Dizideki Eleman Sayısı : " + listInt.size());
        System.out.println("Dizinin Kapasitesi : " + listInt.getCapacity());
        System.out.println();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        listInt.add(7);
        listInt.add(8);
        System.out.println("Dizideki elemanlar : ");
        System.out.println(listInt.toString());
        System.out.println("Dizideki Eleman Sayısı : " + listInt.size());
        System.out.println("Dizinin Kapasitesi : " + listInt.getCapacity());
        System.out.println();
        listInt.add(9);
        listInt.add(10);
        listInt.add(11);
        listInt.add(100);
        listInt.add(13);
        listInt.add(14);
        System.out.println("Dizideki elemanlar : ");
        System.out.println(listInt.toString());
        System.out.println("Dizideki Eleman Sayısı : " + listInt.size());
        System.out.println("Dizinin Kapasitesi : " + listInt.getCapacity());
        System.out.println();

        System.out.println("0. indiste bulunan değer: " + listInt.get(0));
        System.out.println("3. indiste bulunan değer: " + listInt.get(3));

        listInt.remove(0);
        System.out.println("0. indis silindikten sonra dizinin yeni hali: ");
        System.out.println(listInt.toString());
        listInt.set(0, 100);
        System.out.println("0. indis 100 olarak değiştirildikten sonra dizinin yeni hali: ");
        System.out.println(listInt.toString());
        System.out.println();

        System.out.println("Liste INT Durumu : " + (listInt.isEmpty() ? "Boş" : "Dolu"));

        // New list string
        MyList<String> listStr = new MyList<>(3);

        System.out.println("Liste STR Durumu : " + (listStr.isEmpty() ? "Boş" : "Dolu"));

        System.out.println();

        System.out.println("IndexOf(100) : " + listInt.indexOf(100));
        System.out.println("IndexOf(111) :" + listInt.indexOf(111));
        System.out.println("lastIndexOf(100) : " + listInt.lastIndexOf(100));
        System.out.println();

        Object[] dizi = listInt.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);
        System.out.println();

        System.out.println("subList(0,3):");
        MyList<Integer> subList = listInt.sublist(0, 3);
        System.out.println(subList.toString());
        System.out.println();

        System.out.println("Listemde 100 değeri : " + listInt.contains(100));
        System.out.println("Listemde 120 değeri : " + listInt.contains(120));
        System.out.println();

        listInt.clear();
        System.out.println("Liste temizlendikten sonra listenin son hali: ");
        System.out.println(listInt.toString());

    }
}
