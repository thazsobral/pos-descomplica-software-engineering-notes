package classes;

public class Cao {
    /*
     * modificadores de acesso:
     * - private
     * - public
     * - protected
     */
    String nome;
    String cor;
    int idade;
    double peso;

    public Cao() {
      nome = "caramelo";
      idade = 5;
    }
    /*
     * O conceito de sobrecarga de é a criação de método que já existe, mas com parametros diferentes. 
     */
    public Cao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void Anda() {
        System.out.println("Estou andando.. "+ nome);
    }
}
