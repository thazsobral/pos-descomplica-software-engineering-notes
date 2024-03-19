package classes;

public class Cao {
    /*
     * modificadores de acesso:
     * - private
     * - public
     * - protected
     */
    private String nome;
    private String cor;
    private int idade;
    private double peso;

    public Cao() {
      this.nome = "caramelo";
      this.idade = 5;
      this.cor = "preta";
      this.peso = 5.00;
    }
    /*
     * O conceito de sobrecarga de é a criação de método que já existe, mas com parametros diferentes. 
     */
    public Cao(String nome, int idade, String cor, Double peso) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public void Anda() {
        System.out.println("Estou andando.. "+ nome);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean idadeMaiorQue(int numero) {
        return this.idade > numero;
    }
}

