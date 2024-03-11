import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int op;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite um valor ou 99 para sair: ");
            op = scanner.nextInt();
        } while(op != 99);
        scanner.close();
    }
}