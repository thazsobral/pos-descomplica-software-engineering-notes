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

    public int countNodes() {
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

    public void insertInMiddle(MyNode newNode, int position) {
        MyNode temp = this.first;
        int numberNodes, auxPosition = 1;

        numberNodes = this.countNodes();
        if(position <= 1) {
            this.insertInFirst(newNode);
        } else {
            if(position > numberNodes) {
                this.insertInLast(newNode);
            } else {
                while(auxPosition > (position - 1)) {
                    temp = temp.next;
                    auxPosition += 1;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    public void removeInMiddle(int element) {
        MyNode temp = this.first;
        MyNode before = null;
        if(this.first.element == element) {
            this.first = this.first.next;
        } else {
            while(temp != null && temp.element != element) {
                before = temp;
                temp = temp.next;
            }
            if(temp != null) {
                before.next = temp.next;
            }
            if(temp == this.last) {
                this.last = before;
            }
        }
    }

    public MyNode findNode(int element) {
        int i = 1;
        MyNode temp = this.first;
        while(temp != null) {
            if(temp.element == element) {
                System.out.println("No: "+temp.element+" posicao: "+i);
                return temp;
            }
            i += 1;
            temp = temp.next;
        }
        return null;
    }
}