package threads.multithreads;

public class UseExtendThreads {
    public static void main(String[] args) {
        ListNumbers listNumbers = new ListNumbers();
        MyExtendTread1 myExtendTread1 = new MyExtendTread1(listNumbers);
        MyExtendTread2 myExtendTread2 = new MyExtendTread2(listNumbers);

        myExtendTread1.start();
        myExtendTread2.start();
    }
}
