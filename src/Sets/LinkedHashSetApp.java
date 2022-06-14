package Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetApp {
    public static void main(String[] args) {

        // How to use LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(100);
        linkedHashSet.add(1); // duplicate values cannot add again
        linkedHashSet.add(2); // duplicate values cannot add again

        /*
            Between HashSet and LinkedHashSet differences are;
            - HashSet cannot look at the order of my writing the values.
            - LinkedHashSet is linked like its name that's why it can look
             at the order of my writing the values :)
         */

        Iterator iterator = linkedHashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("size: " + linkedHashSet.size());
    }
}
