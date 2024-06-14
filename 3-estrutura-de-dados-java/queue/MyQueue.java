package queue;

public class MyQueue {

    private int length, total, end, start;
    private int[] queue;

    public MyQueue(int valueLength) {
        length = valueLength;
        total = 0;
        end = 0;
        start = 0;
        queue = new int[length];
    };

    public boolean isEmpty() {
        if(total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(total >= length) {
            return true;
        } else {
            return false;
        }
    }

    public void put(int el) {
        if(!isFull()) {
            queue[end] = el;
            end += 1;
            total += 1;
            if(end >= length) {
                end = 0;
            }
        } else {
            System.out.println("Fila cheia");
        }
    }

    public int pop() {
        int el = 0;
        if(isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            el = queue[start];
            start += 1;
            total -= 1;
            if(start >= length) {
                start = 0;
            }
        }
        return el;
    }

    /*public void firstElement() {
        if(!isEmpty()) {
            System.out.println("O primeiro elemento da fila é: "+queue[start]);
        } else {
            System.out.println("Fila vazia");
        }
    }//*/

    public int firstElement() { // my version
        if(!isEmpty()) {
            return queue[start];
        } else {
            return -1;
        }
    }

    /*public void showQueue() {
        int i, aux;
        aux = start;
        for(i = 1; i <= total; i++) {
            System.out.println("Elemento: "+queue[i]+" posicao: "+i);
            aux += 1;
            if(aux >= length) {
                aux = 0;
            }
        }
    }//*/

    public String showQueue() {
        String stringQueue = "";
        int aux = start;
        for(int i = 1; i <= total; i++) {
            stringQueue += "Elemento: "+queue[i]+" posicao: "+i+"\n";
            aux += 1;
            if(aux >= length) {
                aux = 0;
            }
        }
        return stringQueue;
    }
}
