package Sets;

import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {

        // How to use TreeSet
        /*
            Basically, TreeSet needs a compare method.
            Like all sets duplicate values cannot add to the set.
         */

        TreeSet<MyClass> treeSet = new TreeSet<>(new OrderAgeComparator().reversed());
        treeSet.add(new MyClass("Servet", 22));
        treeSet.add(new MyClass("Ahmet", 21));
        treeSet.add(new MyClass("Buse", 19));
        treeSet.add(new MyClass("Gulay", 28));
        treeSet.add(new MyClass("Aysel", 20));

        for (MyClass val : treeSet){
            System.out.println(val.getName());
        }

        System.out.println("size: " + treeSet.size());

        System.out.println("------");
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(1022);
        numbers.add(10);
        numbers.add(-10);
        numbers.add(22);

        for (Integer number : numbers) {
            System.out.println(number);
        }

    }
}
