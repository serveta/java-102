package Sets;

import java.util.HashSet;

public class HashSetApp {
    public static void main(String[] args) {

        // How to use HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("d");
        hashSet.add("c");
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("e");

        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("size: " + hashSet.size());

        System.out.println("-------------adding same value (b,e)--------------");

        hashSet.add("b"); // it cannot add again because there is a duplicate value
        hashSet.add("e"); // the same goes for this value
        hashSet.add("2");
        hashSet.add("1");

        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("size: " + hashSet.size());

        System.out.println("-------------remove (d)--------------");

        hashSet.remove("d");

        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("size: " + hashSet.size());

        System.out.println("-------------clear--------------");
        hashSet.clear();
        System.out.println("size: " + hashSet.size());
    }
}
