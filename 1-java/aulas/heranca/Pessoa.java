package heranca;

public class Pessoa {
    public String nome;
    private int rg;

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public void quemE(){
        System.out.println("Nome: "+this.nome+"\nRG: "+this.rg);
    };
}
