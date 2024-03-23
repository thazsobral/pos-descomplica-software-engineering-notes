package heranca.pessoa;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("João", 1213, 01222, 100.10, 1.5);
        vendedor.quemE();
        vendedor.printCodFuncional();
        vendedor.printSalario();
        vendedor.getComissao();

        Gerente gerente = new Gerente("Marcos", 44566, 44444, 200.10, "email@email.com");
        gerente.quemE();
        gerente.printCodFuncional();
        gerente.printSalario();
        gerente.getEmail();
    }
}
