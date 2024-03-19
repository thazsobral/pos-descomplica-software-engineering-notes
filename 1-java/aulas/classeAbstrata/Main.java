package aulas.classeAbstrata;

public class Main {
    public static void main(String[] args) {
        Conta cp = new Poupanca();
        Corrente cc = new Corrente();

        cp.setSaldo(5000);
        cp.imprimeExtrato();

        cc.setSaldo(5000);
        cc.imprimeExtrato();
        cc.sacarDinheiro(100);
        cc.imprimeExtrato();
    }
}
