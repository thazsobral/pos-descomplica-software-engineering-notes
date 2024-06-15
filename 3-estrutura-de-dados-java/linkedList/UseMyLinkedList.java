package linkedList;

public class UseMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyNode myNode = new MyNode(1);
        myLinkedList.insertInFirst(myNode);
        myNode = null;
        myNode = new MyNode(2);
        myLinkedList.insertInFirst(myNode);
        myNode = null;
        myNode = new MyNode(3);
        myLinkedList.insertInLast(myNode);
        myNode = null;
        myNode = new MyNode(4);
        myLinkedList.insertInFirst(myNode);
        myLinkedList.showFirstElement();
        myLinkedList.showLinkedList();
        //myLinkedList.destroy();
        //myLinkedList.showLinkedList();
    }
}
