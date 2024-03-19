package aulas.classeAbstrata;

public class Corrente extends Conta{
    public void sacarDinheiro(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }
    public void imprimeExtrato() {
        System.out.println("Saldo: " + getSaldo());
    }
}
