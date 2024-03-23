package heranca.pessoa;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, int rg, int codFuncional, double salario, double comissao) {
        super(nome, rg, codFuncional, salario);
        this.comissao = comissao;
    }

    public void getComissao() {
        System.out.println("Comissao: "+this.comissao);
    }
}
