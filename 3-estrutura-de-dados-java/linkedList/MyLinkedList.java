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
}