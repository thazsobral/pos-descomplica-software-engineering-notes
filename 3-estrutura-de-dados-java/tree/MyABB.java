package tree;

public class MyABB {
    MyNode root;

    public MyNode insert(MyNode tree, int newValue) {
        if (tree == null) {
            return new MyNode(newValue);
        } else {
            if (newValue < tree.value) {
                tree.left = this.insert(tree.left, newValue);
            } else {
                tree.right = this.insert(tree.right, newValue);
            }
        }
        return tree;
    }

    public void insertNode(int newValue) {
        root = insert(this.root, newValue);
    }

    public void showLeft(MyNode tree) {
        if (tree != null) {
            showLeft(tree.left);
            System.out.print("esq.: " + tree.value + "\t");
        }
    }

    public void showNodeLeft() {
        showLeft(this.root);
    }

    public void showRight(MyNode tree) {
        if (tree != null) {
            showRight(tree.right);
            System.out.print("dir.: " + tree.value + "\t");
        }
    }

    public void showNodeRight() {
        showRight(this.root);
    }

    public void showRoot() {
        System.out.println("Raiz: " + this.root.value + "\t");
    }

    public void showNode() {
        showNodeLeft();
        showRoot();
        showNodeRight();
    }

    public void excluirNo(int item) {
        try {
            MyNode tempNode, father, son, temp;
            tempNode = this.root;
            father = null;
            son = this.root;

            while (tempNode != null && tempNode.value != item) {
                father = tempNode;
                if (item < tempNode.value) {
                    tempNode = tempNode.left;
                } else {
                    tempNode = tempNode.right;
                }
                /*
                 * if (tempNode == null) {
                 * 
                 * }//
                 */
            }

            if (father == null) {
                if (tempNode.right == null) {
                    this.root = tempNode.left;
                } else {
                    if (tempNode.left == null) {
                        this.root = tempNode.right;
                    } else {
                        for (temp = tempNode, son = tempNode.left; son.right != null; temp = son, son = son.right)
                            ;
                        if (son != tempNode.left) {
                            temp.right = son.left;
                            son.left = this.root.left;
                        }
                        son.right = this.root.right;
                        this.root = son;
                    }
                }
            }

            else {
                if (tempNode.right == null) {
                    if (father.left == tempNode) {
                        father.left = tempNode.left;
                    } else {
                        father.right = tempNode.left;
                    }
                } else {
                    if (tempNode.left == null) {
                        if (father.left == tempNode) {
                            father.left = tempNode.right;
                        } else {
                            father.right = tempNode.right;
                        }
                    } else {
                        for (temp = tempNode, son = tempNode.left; son.right != null; temp = son, son = son.right)
                            ;
                        if (son != tempNode.left) {
                            temp.right = son.left;
                            son.left = tempNode.left;
                        }
                        son.right = tempNode.right;
                        if (father.left == tempNode) {
                            father.left = son;
                        } else {
                            father.right = son;
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("\n\nitem não localizado!");
        }
    }

    public void visit(MyNode tree) {
        System.out.print("no: " + tree.value + "\t");
    }

    public void inSequence(MyNode abb) {
        if (abb != null) {
            this.inSequence(abb.left);
            this.visit(abb);
            this.inSequence(abb.right);
        }
    }

    public void postSequence(MyNode abb) {
        if (abb != null) {
            this.postSequence(abb.left);
            this.postSequence(abb.right);
            this.visit(abb);
        }
    }

    public void preSequence(MyNode abb) {
        if (abb != null) {
            this.visit(abb);
            this.preSequence(abb.left);
            this.preSequence(abb.right);
        }
    }
}
