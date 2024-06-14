package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        try {
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(4);
            stack.push(3);
    
            System.out.println(stack.peek());
    
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("Pilha vázia: "+e.getCause());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
