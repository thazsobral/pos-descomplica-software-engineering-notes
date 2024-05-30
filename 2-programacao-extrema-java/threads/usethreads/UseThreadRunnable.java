package threads.usethreads;

public class UseThreadRunnable {
    public static void main(String[] args) {
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread = new Thread(myThreadRunnable);
        thread.start();
        System.out.println("Minha class principal.");
    }
}
