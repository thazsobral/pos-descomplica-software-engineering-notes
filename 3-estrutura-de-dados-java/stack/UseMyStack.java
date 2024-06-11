package stack;

public class UseMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(2);
        System.out.println("Empilhando ...");
        myStack.put(2);
        myStack.put(6);
        myStack.put(7);
        myStack.showStack();
        System.out.println("Desempilhando ...");
        myStack.pop();
        myStack.pop();
        myStack.showStack();
        System.out.println("Empilhando ...");
        myStack.put(10);
        myStack.showStack();
    }
}
