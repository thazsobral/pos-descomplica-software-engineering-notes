package threads.multithreads;

public class ListNumbers {
    synchronized void printTable(int n) {
        for(int i = 1; i <= 4; i++) {
            System.out.println(n+i);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
