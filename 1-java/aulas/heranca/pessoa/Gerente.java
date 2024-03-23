package heranca.pessoa;

public class Gerente extends Funcionario{
    private String email;

    public Gerente(String nome, int rg, int codFuncional, double salario, String email) {
        super(nome, rg, codFuncional, salario);
        this.email = email;
    }

    public void getEmail() {
        System.out.println("Email: "+this.email);
    }
}
