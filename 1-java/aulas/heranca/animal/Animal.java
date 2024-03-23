package heranca.animal;

public class Animal {
    protected String nome;

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void comer() {
        System.out.println("Eu gosto de comer.");
    }
}
