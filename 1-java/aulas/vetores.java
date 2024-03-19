class Main {
    public static void main(String[] args) {
        int[] vetor = new int[6];
        int[] vetor2 = new int[6];

        vetor[0] = 1;
        vetor[3] = 5;
        vetor[1] = 2;

        System.out.println(vetor); //[I@4671e53b // mensagem nesse formato são lixos de memória
    }
}