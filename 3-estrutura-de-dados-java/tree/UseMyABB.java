package tree;

public class UseMyABB {
    public static void main(String[] args) {
        MyABB tree = new MyABB();
        tree.insertNode(1);
        tree.insertNode(5);
        tree.insertNode(4);
        tree.insertNode(8);
        tree.insertNode(0);
        tree.showNode();
    }
}
