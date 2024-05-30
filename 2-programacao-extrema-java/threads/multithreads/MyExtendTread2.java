package threads.multithreads;

public class MyExtendTread2 extends Thread {
    ListNumbers listNumbers;

    MyExtendTread2(ListNumbers listNumbers) {
        this.listNumbers = listNumbers;
    }

    public void run() {
        this.listNumbers.printTable(1000);
    }
}
