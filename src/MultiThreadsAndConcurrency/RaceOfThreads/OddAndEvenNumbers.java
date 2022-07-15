package MultiThreadsAndConcurrency.RaceOfThreads;

import java.util.ArrayList;

public class OddAndEvenNumbers implements Runnable {
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> oddNumbers;
    private ArrayList<Integer> evenNumbers;
    private int quarterI;
    private int quarter;

    public OddAndEvenNumbers() {
        this.numbers = new ArrayList<>();
        this.oddNumbers = new ArrayList<>();
        this.evenNumbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            this.numbers.add(i);
        }
        this.quarterI = 0;
        this.quarter = this.numbers.size() / 4;
    }

    @Override
    public void run() {
        oddAndEvenNumSearch();
    }

    private synchronized void oddAndEvenNumSearch() {
        System.out.println(" *The set of numbers " + Thread.currentThread().getName() + " has :");
        for (int i = this.quarterI; i < this.quarter; i++) {
            System.out.print(this.numbers.get(i) + ", ");
            if (this.numbers.get(i) % 2 == 0) {
                this.evenNumbers.add(this.numbers.get(i));
            } else {
                this.oddNumbers.add(this.numbers.get(i));
            }
        }
        System.out.println("\n");
        this.quarterI = this.quarter;
        this.quarter += (this.numbers.size() / 4);
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }
}
