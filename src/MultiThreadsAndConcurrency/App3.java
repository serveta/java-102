package MultiThreadsAndConcurrency;

public class App3 {
    public static void main(String[] args) throws InterruptedException {
        Counter3 c1 = new Counter3("c1");

        Thread t1 = new Thread(c1);

        t1.start();
        Thread.sleep(1000);
        c1.stop();

    }
}
