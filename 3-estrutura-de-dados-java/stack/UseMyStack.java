package stack;

import javax.swing.JOptionPane;

public class UseMyStack {
    public static void main(String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da pilha: "));
        MyStack myStack = new MyStack(length);
        int op, value;
        String stringStack;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n1-empilhar\n2-desempilhar\n3-mostrar topo\n4-mostrar pilha\n0-sair\n\nop > "));
            switch (op) {
                case 1:
                    value = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
                    myStack.put(value);
                    break;
                case 2:
                    value = myStack.pop();
                    JOptionPane.showMessageDialog(null, "Desempilhado: "+value);
                    break;
                case 3:
                    value = myStack.topElement();
                    JOptionPane.showMessageDialog(null, "Elemento do topo: "+value);
                    break;
                case 4:
                    stringStack = myStack.showStack();
                    JOptionPane.showMessageDialog(null, "Pilha:\n"+stringStack);
                    break;
                case 0:
                    System.out.println("Tchau!!");
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
        while(op != 0);
    }
}
