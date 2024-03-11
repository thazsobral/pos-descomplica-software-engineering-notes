import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira taboada que você quer: ");
        int i = scanner.nextInt();
        System.out.println("Digite a última taboada que você quer: ");
        int f = scanner.nextInt();
        for(int inicio = i; inicio <= f; inicio++) {
            System.out.print("\n");
            for(int valor = 0; valor <= 10; valor++) {
                System.out.println(inicio+"x"+valor+"="+inicio*valor);
            }
        }
        scanner.close();
    }
}