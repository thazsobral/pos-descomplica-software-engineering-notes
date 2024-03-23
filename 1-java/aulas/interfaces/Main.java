package aulas.interfaces;

public class Main {
    public static void main(String[] args) {
        Conta cp = new Poupanca();
        cp.depositar(730);
        cp.sacar(28);
        System.out.println(cp.getSaldo());
    }
}
