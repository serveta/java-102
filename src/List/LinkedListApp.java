package List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Servet");
        linkedList.add("Bahri");
        linkedList.add("Sara");
        linkedList.add("Fulya");
        linkedList.add("Fehmi");

        System.out.println("*** get List; ");
        for (String val : linkedList) {
            System.out.println(val);
        }

        System.out.println("\n*** linkedList.contains(\"Servet\") : " + linkedList.contains("Servet"));

    }
}
