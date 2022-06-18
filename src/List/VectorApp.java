package List;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();

        vector.add("Beren");
        vector.add("Selim");
        vector.add("Salih");
        vector.add("Gül");
        vector.add("Yasemin");

        System.out.println("\n get list;");
        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("*** size() : " + vector.size());

        System.out.println("*** clear();");
        vector.clear();
        System.out.println("*** size() : " + vector.size());
    }
}
