package MultiThreadsAndConcurrency.RaceOfThreads;

public class App {
    public static void main(String[] args) {
        OddAndEvenNumbers oddEven = new OddAndEvenNumbers();

        Thread t1 = new Thread(oddEven);
        Thread t2 = new Thread(oddEven);
        Thread t3 = new Thread(oddEven);
        Thread t4 = new Thread(oddEven);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(" *Odd Numbers: ");
        for (Integer val : oddEven.getOddNumbers()) {
            System.out.print(val + ", ");
        }

        System.out.println("\n\n *Even Numbers: ");
        for (Integer val : oddEven.getEvenNumbers()) {
            System.out.print(val + ", ");
        }
    }
}
