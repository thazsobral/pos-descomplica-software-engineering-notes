import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o ano? ");
        int ano = scanner.nextInt();
        if(((ano % 4) == 0 && (ano%100) > 0) || ((ano%400) == 0)){
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }
    }
}
