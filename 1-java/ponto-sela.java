/*
 * Considere que você têm a matriz de duas dimensões
 * Aqui vamos encontrar o ponto de sela de uma matriz quadrática nxn.
 * O ponto de sela é:
 * - o maior elemento de uma linha
 * - o menor elemento de uma coluna
 */

class Main {
    public static void main(String[] args) {
        int[][] matriz = {{9,8,7},{5,3,2},{6,6,7}};
        int[] maiorNaLinha = new int[3]; // pois temos 3 linhas
        int[] menorNaColuna = new int[3]; // pois temos 3 colunas

        // mostra a matriz
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        
        // inicia os vetores
        for(int i=0; i<3; i++) {
            menorNaColuna[i] = 10;
        }

        for(int i=0; i<3; i++) {
            maiorNaLinha[i] = 0; // pois temos que iniciar o ponto de referência com um elemento maior que o maior item (9)
        }

        // busca maior elemento na linha 0
        for(int i=0; i<3; i++) {
            if(matriz[0][i] > maiorNaLinha[0]) {
                maiorNaLinha[0] = matriz[0][i];
            }
        }
        // busca maior elemento na linha 1
        for(int i=0; i<3; i++) {
            if(matriz[1][i] > maiorNaLinha[1]) {
                maiorNaLinha[1] = matriz[1][i];
            }
        }
        // busca maior elemento na linha 2
        for(int i=0; i<3; i++) {
            if(matriz[2][i] > maiorNaLinha[2]) {
                maiorNaLinha[2] = matriz[2][i];
            }
        }
        // busca menor elemento na coluna 0
        for(int i=0; i<3; i++) {
            if(matriz[i][0] < menorNaColuna[0]) {
                menorNaColuna[0] = matriz[i][0];
            }
        }
        // busca menor elemento na coluna 1
        for(int i=0; i<3; i++) {
            if(matriz[i][1] < menorNaColuna[1]) {
                menorNaColuna[1] = matriz[i][1];
            }
        }
        // busca menor elemento na coluna 2
        for(int i=0; i<3; i++) {
            if(matriz[i][2] < menorNaColuna[2]) {
                menorNaColuna[2] = matriz[i][2];
            }
        }
        //compara os valores para encontrar o ponto de sela
        boolean temPontoDeSela = false;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(maiorNaLinha[i] == menorNaColuna[j]) {
                    temPontoDeSela = true;
                    System.out.println("Ponto de sela: "+maiorNaLinha[i]);
                }
            }
        }
        
        if (!temPontoDeSela) {
            System.out.println("Essa matriz não têm ponto de sela.");
        }
    }
}
