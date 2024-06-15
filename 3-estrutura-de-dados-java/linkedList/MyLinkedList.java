package linkedList;

public class MyLinkedList {
    MyNode first, last;

    MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        if(this.first == null && this.last == null) {
            return true;
        } else {
            return false;
        }
    }

    public void destroy() {
        this.first = null;
        this.last = null;
    }

    public int countNode() {
        int length = 0;
        MyNode temp = this.first;

        while(temp != null) {
            length += 1;
            temp = temp.next;
        }
        return length;
    }

    public void showLinkedList() {
        MyNode temp = this.first;
        int i = 1;

        while(temp != null) {
            System.out.println("Elemento: "+temp.element+" posição: "+i);
            temp = temp.next;
            i += 1;
        }
    }

    public void showFirstElement() {
        if(!this.isEmpty()) {
            System.out.println("O primeiro elemento é: "+this.first.element);
        } else {
            System.out.println("Lista ligada vazia");
        }
    }

    public void lastElement() {
        if(!this.isEmpty()) {
            System.out.println("O primeiro elemento é: "+this.last.element);
        } else {
            System.out.println("Lista ligada vazia");
        }
    }

    public void insertInFirst(MyNode newNode) {
        if(this.isEmpty()) {
            this.last = newNode;
        } else {
            newNode.next = first;
        }
        this.first = newNode;
    }

    public void insertInLast(MyNode newNode) {
        if(this.isEmpty()) {
            this.first = newNode;
        } else {
            this.last.next = newNode;
        }
        this.last = newNode;
    }
}