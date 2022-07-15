package MultiThreadsAndConcurrency.CriticalSectionsAndRaceCondition;

public class QMatic implements Runnable {
    private int orderNo;

    public QMatic() {
        this.orderNo = 0;
    }

    @Override
    public void run() {
        increase();
    }

    public int getOrderNo() {
        return orderNo;
    }

    private synchronized void increase() {
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() + " - OrderNo: " + this.orderNo);
    }
}
