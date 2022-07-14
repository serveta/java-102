package MultiThreadsAndConcurrency;

public class App {
    public static void main(String[] args) {
        Counter counter1 = new Counter("C-1");
        Counter counter2 = new Counter("C-2");

        counter1.start();
        counter2.start();
    }
}
