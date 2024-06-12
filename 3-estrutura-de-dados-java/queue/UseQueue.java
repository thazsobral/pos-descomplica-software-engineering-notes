package queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
