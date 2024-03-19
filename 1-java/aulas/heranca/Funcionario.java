package heranca;

public class Funcionario extends Pessoa{
    private int codFuncional;
    private double salario;

    public Funcionario(String nome, int rg, int codFuncional, double salario) {
        super(nome, rg);
        this.codFuncional = codFuncional;
        this.salario = salario;
    }

    public void printCodFuncional(){
        System.out.println("CodFunciona: "+this.codFuncional);
    };

    public void printSalario() {
        System.out.println("Salario: "+this.salario);
    }
}
