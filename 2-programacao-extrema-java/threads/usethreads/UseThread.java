package threads.usethreads;

public class UseThread extends Thread{
    public void run() {
        System.out.println("Thread secundária.");
    }
    public static void main(String[] args) {
        UseThread useThread = new UseThread();
        useThread.start();
        System.out.println("Thread principal.");
    }
}
