package List;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueApp {

    public static void main(String[] args) {
        // When we use queues; if we want to use a comparator, we need to use Priority Queue
        PriorityQueue<String> pQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        pQueue.add("Ferit");
        pQueue.add("Zehra");
        pQueue.add("Mustafa");
        pQueue.add("Deniz");
        pQueue.add("Aslan");

        for (String val : pQueue) {
            System.out.println(val);
        }

        System.out.println(" size() : " + pQueue.size());

        System.out.println("***");
        System.out.println(" poll() : " + pQueue.poll());
        System.out.println("***");

        for (String val : pQueue) {
            System.out.println(val);
        }

        System.out.println(" size() : " + pQueue.size());

    }
}
