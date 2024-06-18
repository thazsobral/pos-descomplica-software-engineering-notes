package tree;

public class MyABB {
    private MyNode root;

    public MyNode insert(MyNode tree, int newValue) {
        if(tree == null) {
            return new MyNode(newValue);
        } else {
            if(newValue < tree.value) {
                tree.left = this.insert(tree.left, newValue);
            } else {
                tree.right = this.insert(tree.right, newValue);
            }
        }
        return tree;
    }

    public void insertNode(int newValue) {
        this.root = insert(root, newValue);
    }

    public void showLeft(MyNode tree) {
        if(tree != null) {
            showLeft(tree.left);
            System.out.println(tree.value);
        }
    }

    public void showNodeLeft() {
        showLeft(root);
    }

    public void showRight(MyNode tree) {
        if(tree != null) {
            showRight(tree.right);
            System.out.println(tree.value);
        }
    }

    public void showNodeRight() {
        showRight(root);
    }

    public void showRoot() {
        System.out.println("Raiz: "+this.root.value);
    }

    public void showNode() {}

    public void removeNode(int value) {
        MyNode temp, father, son, tempNode;
        tempNode = this.root;
        father = null;
        son = this.root;

        while(tempNode != null && tempNode.value != value) {
            father = tempNode;
            
            if(value < tempNode.value) {
                tempNode = tempNode.left;
            } else {
                tempNode = tempNode.right;
            }
            
            if(tempNode == null) {
                System.out.println("Valor não localizado");
            }

            if(father == null) {
                if(tempNode.right == null) {
                    this.root = tempNode.left;
                } else {
                    if(tempNode.left == null) {
                        this.root = tempNode.right;
                    } else {
                        //for(temp = tempNode, son = tempNode.left; son.right != null; temp = son, son = son.right) {}
                        if(son != tempNode.left) {
                            temp.right = son.left;
                            son.left = this.root.left;
                        }
                        son.right = this.root.right;
                        this.root = son;
                    }
                }
            } else {
                if(tempNode.right == null) {
                    if(father.left == tempNode) {
                        father.left = tempNode.left;
                    } else {
                        father.right = tempNode.left;
                    }
                } else {
                    if(tempNode == null) {
                        if(father.left == tempNode) {
                            father.left = tempNode.right;
                        } else {
                            father.right = tempNode.right;
                        }
                    } else {
                        //for(temp = tempNode, son = tempNode.left; son.right != null; temp = son, son = son.right) {}
                        if(son != tempNode.left) {
                            temp.right = son.left;
                            son.left = tempNode.left;
                        }
                        son.right = tempNode.right;
                        if(father.left == tempNode) {
                            father.left = son;
                        } else {
                            father.right = son;
                        }
                    }
                }
            }
        }
    }
}
