package MultiThreadsAndConcurrency.CriticalSectionsAndRaceCondition;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Main Thread Start");

        QMatic qMatic = new QMatic();

        ArrayList<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            threadList.add(new Thread(qMatic));
            threadList.get(i).start();
        }

        try {
            for (int i = 0; i < 50; i++) {
                threadList.get(i).join();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("* Main Thread Terminated - last order no: " + qMatic.getOrderNo());
    }
}
