package matrixes;

import javax.swing.JOptionPane;

public class Sum {
    public static void main(String[] args) {
        int matrixSum[][], l, c, sum=0, liml=2, limc=3;
        matrixSum = new int[2][3];

        for(l = 0; l < liml; l++) {
            for(c = 0; c < limc; c++) {
                matrixSum[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                if(c==limc-1) System.out.print(matrixSum[l][c]);
                else System.out.print(matrixSum[l][c]+"|");
                sum += matrixSum[l][c];
            }
            System.out.print("\n");
        }
        System.out.println("A soma da matriz é: "+sum);
        System.exit(0);
    }
}
