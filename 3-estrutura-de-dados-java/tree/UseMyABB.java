package tree;

public class UseMyABB {
    public static void main(String[] args) {
        MyABB tree = new MyABB();
        tree.insertNode(4);
        tree.insertNode(2);
        tree.insertNode(6);
        tree.insertNode(1);
        tree.insertNode(3);
        tree.insertNode(5);
        tree.insertNode(7);
        //tree.showNode();
        tree.inSequence(tree.root);
        //tree.preSequence(tree.root);
        //tree.postSequence(tree.root);
        tree.excluirNo(0);
        System.out.println();
        tree.inSequence(tree.root);
    }
}
