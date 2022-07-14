package Thread;

public class Counter2 implements Runnable {
    String name;

    public Counter2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " started!");
        for (int i = 0; i < 50; i++) {
            System.out.println(this.name + ": " + i);
        }
        System.out.println(this.name + " finish!");
    }
}
