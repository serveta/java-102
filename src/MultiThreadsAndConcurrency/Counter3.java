package MultiThreadsAndConcurrency;

public class Counter3 implements Runnable {
    String name;
    boolean isRun = true;

    public Counter3(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " started!");
        int i = 0;

        while (this.isRun){
            System.out.println(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(this.name + " finish!");
    }

    public void stop() {
        this.isRun = false;
    }
}
