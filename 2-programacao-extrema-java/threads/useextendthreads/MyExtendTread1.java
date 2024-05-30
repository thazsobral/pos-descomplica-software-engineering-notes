package threads.useextendthreads;

public class MyExtendTread1 extends Thread {
    ListNumbers listNumbers;

    MyExtendTread1(ListNumbers listNumbers) {
        this.listNumbers = listNumbers;
    }

    public void run() {
        this.listNumbers.printTable(10);
    }
}
