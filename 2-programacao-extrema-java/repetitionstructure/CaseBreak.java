package repetitionstructure;

import java.util.Scanner;

public class CaseBreak {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 1;
        do {
            System.out.println("Escolha uma das opções:\n1-repetir\n0-sair");
            op = teclado.nextInt();
            if (op == 0) {
                break;
            }
        } while (op != 0);
    }
}
