import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String nome = "";
        System.out.println("Informe seu nome: ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.next();
        System.out.println("Olá, "+nome+"!");
        scanner.close();
    }
}