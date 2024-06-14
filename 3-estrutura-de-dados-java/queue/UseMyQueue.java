package queue;

import javax.swing.JOptionPane;

public class UseMyQueue {
    public static void main(String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila: "));
        MyQueue myQueue = new MyQueue(length);
        int op, value;
        String stringQueue;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n1-enfileirar\n2-desenfileirar\n3-mostrar primeiro elemento\n4-mostrar fila\n0-sair\n\nop > "));
            switch (op) {
                case 1:
                    value = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
                    myQueue.put(value);
                    break;
                case 2:
                    value = myQueue.pop();
                    JOptionPane.showMessageDialog(null, "Desempilhado: "+value);
                    break;
                case 3:
                    // TODO: Ajustar
                    value = myQueue.firstElement();
                    JOptionPane.showMessageDialog(null, "Elemento do inicio da fila: "+value);
                    break;
                case 4:
                    // TODO: Ajustar
                    stringQueue = myQueue.showQueue();
                    JOptionPane.showMessageDialog(null, "fila:\n"+stringQueue);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Tchau!!");
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
        while(op != 0);
    }
}
