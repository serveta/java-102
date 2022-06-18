package List;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Salih");
        queue.add("Serkan"); // if it can not add it can throw an exception
        queue.offer("Berna"); // if it can not add it can return false

        System.out.println("\n element();" + queue.element()); // it can get the first element without removing; if queue is empty : java.util.NoSuchElementException

        for (String val : queue) {
            System.out.println(val);
        }

        System.out.println("\n poll();" + queue.poll()); // it can get the first element with removing; if queue is empty : false

        for (String val : queue) {
            System.out.println(val);
        }

        System.out.println("\n peek();" + queue.peek()); // it can get the first element without removing; if queue is empty : false

        for (String val : queue) {
            System.out.println(val);
        }
    }
}
