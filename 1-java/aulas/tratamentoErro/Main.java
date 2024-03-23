package aulas.tratamentoErro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Digite um valor");
            int n1 = s.nextInt();
            System.out.println(n1);
        } catch (Exception e) {
            System.out.println("Erro: valor não é um número.");
        }
    }
}
