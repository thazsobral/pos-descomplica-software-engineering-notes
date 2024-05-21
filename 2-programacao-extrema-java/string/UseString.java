package string;

import java.util.Scanner;

public class UseString {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String name;

        System.out.println("Digite seu nome: ");
        name = teclado.nextLine(); // use nextLine() or next()

        System.out.println("Seu nome é: "+ name);;
    }
}
