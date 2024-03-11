import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        while(op != 99) {
            System.out.println("Digite qualquer valor ou 99 para sair: ");
            op = scanner.nextInt();
        }
        scanner.close();
    }
}