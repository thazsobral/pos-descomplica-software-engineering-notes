package stack;

public class MyStack {
    private int top = -1;
    private int length;
    private int[] elements;

    public MyStack(int defineLength) {
        length = defineLength;
        elements = new int[length];
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
            elements[top] = el;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    /*public int pop() {
        int unstacked = 0;
        if(isEmpty()) {
            System.out.println("Pilha vázia.");
        } else {
            unstacked = elements[top];
            top -= 1;
        }
        return unstacked;
    }//*/
    
    public int pop() { // my version the method pop
        if(!isEmpty()) {
            int el = elements[top];
            top -= 1;
            return el;
        } else {
            return -1;
        }
    }//*/

    /*public void topElement() {
        if(top >= 0) {
            System.out.println("O elemento do topo é: "+elements[top]);
        } else {
            System.out.println("Pilha vázia.");
        }
    }//*/

    public int topElement() { // my version the method topElement
        if(top >= 0) {
            return elements[top];
        } else {
            return -1;
        }
    }//*/

    public void showStack() {
        for(int i = top; i >= 0; i--) {
            System.out.println("Element: "+elements[i]+" posição: "+(i+1));
        }
    }
}
