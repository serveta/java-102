package Thread;

public class App2 {
    public static void main(String[] args) {
        Counter2 c1 = new Counter2("c1");
        Counter2 c2 = new Counter2("c2");
        Counter2 c3 = new Counter2("c3");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
    }
}
