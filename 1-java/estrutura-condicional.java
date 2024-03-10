/*
 * Execício para estrutura condicional
 * Projeto para adivinhar um número entre um intervalo
 */

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Random random = new Random(); // cria um randomizador
        Scanner scanner = new Scanner(System.in); // criar um leitor de entrada (System.in, é o teclado)

        System.out.println("Onde o intervalo termina?");
        int b = scanner.nextInt(); // recebe um número inteiro
        System.out.println("Qual número voce acha que é?");
        int y = scanner.nextInt(); // recebe outro número inteiro
        int x = random.nextInt(b+1); // sorteia um número (+1, pois ele sempre vai até um antes do limite, então se quiser incluir o número, deve passar +1)

        System.out.print("O número é: "+x+".\n");
        if(y == x) {
            System.out.println("Acertou miseráve!!");
        } else {
            System.out.println("Poxa, não foi dessa vez.");
        }
    }
}