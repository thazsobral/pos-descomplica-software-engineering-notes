package aulas.interfaces;

/**
 * interface para definir os métodos obrigatórios
 */
public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
