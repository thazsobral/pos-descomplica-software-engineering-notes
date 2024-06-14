package stack;

public class MyStack {
    private int top = -1;
    private int length;
    private int[] stack;

    public MyStack(int defineLength) {
        length = defineLength;
        stack = new int[length];
    }

    public boolean isFull() {
        if(top >= length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void put(int el) {
        if(!isFull()) {
            top += 1;
            stack[top] = el;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    /*public int pop() {
        int unstacked = 0;
        if(isEmpty()) {
            System.out.println("Pilha vázia.");
        } else {
            unstacked = stack[top];
            top -= 1;
        }
        return unstacked;
    }//*/
    
    public int pop() { // my version the method pop
        if(!isEmpty()) {
            int el = stack[top];
            top -= 1;
            return el;
        } else {
            System.out.println("Pilha vazia");
            return -1;
        }
    }//*/

    /*public void topElement() {
        if(top >= 0) {
            System.out.println("O elemento do topo é: "+stack[top]);
        } else {
            System.out.println("Pilha vázia.");
        }
    }//*/

    public int topElement() { // my version the method topElement
        if(top >= 0) {
            return stack[top];
        } else {
            return -1;
        }
    }//*/

    public String showStack() {
        String stringStack = "";
        for(int i = top; i >= 0; i--) {
            stringStack += "Element: "+stack[i]+" posição: "+(i+1)+"\n";
        }
        return stringStack;
    }
}
