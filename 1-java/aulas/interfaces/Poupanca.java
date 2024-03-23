package aulas.interfaces;

/*
 * Quando voce usa uma interface voce usa implements ao inves de extends
 * Sendo agora obrigatorio definir tudo o que for abstrato (senao da erro), diferente de uma classe abstrata
 */
public class Poupanca implements Conta {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }
}
