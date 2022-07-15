package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(22);
        myList.add(42);
        myList.add(106);
        myList.add(106);
        myList.add(98);
        myList.add(73);
        myList.add(99);
        myList.add(106);
        myList.add(6);
        myList.add(42);

        System.out.println(" *forEach");
        // myList.forEach(val -> System.out.println(val));
        myList.forEach(System.out::println);

        System.out.println(" *filter: ");
        myList.stream().filter(val -> val > 50).forEach(System.out::println);

        System.out.println(" *distinct");
        myList.stream().distinct().forEach(System.out::println);

        System.out.println(" *sorted");
        myList.stream().sorted().forEach(System.out::println);

        System.out.println(" *sorted(reverse)");
        myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println(" *limit(2)");
        myList.stream().limit(2).forEach(System.out::println);

        System.out.println(" *skip(4).limit(3)");
        myList.stream().skip(4).limit(3).forEach(System.out::println);

        System.out.println(" *count");
        long count = myList.stream().filter(val -> val < 50).distinct().count();
        System.out.println(count);

        System.out.println(" *anyMatch(val>30)");
        boolean anyMatch = myList.stream().anyMatch(val -> val > 30);
        System.out.println(anyMatch);

        System.out.println(" *allMatch(val < 0)");
        boolean allMatch = myList.stream().allMatch(val -> val < 0);
        System.out.println(allMatch);

        System.out.println(" *noneMatch(val < 0)");
        boolean noneMatch = myList.stream().noneMatch(val -> val > 0);
        System.out.println(noneMatch);

        System.out.println(" *map((val*val)+3)");
        myList.stream().distinct().sorted().map(val -> (val*val)+3).forEach(System.out::println);

    }
}
