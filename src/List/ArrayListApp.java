package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("Aren");
        arrList.add("Arda");
        arrList.add("Beren");
        arrList.add("Kemal");
        arrList.add("Ceren");

        System.out.println("***");
        System.out.println(" remove(\"Arda\") : " + arrList.remove("Arda"));
        System.out.println("***");

        System.out.println("\n get list; \n***");
        for (String val : arrList) {
            System.out.println(val);
        }

    }

}
