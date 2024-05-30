package threads.usethreads;

public class UseMyThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Minha classe principal.");
    }
}
