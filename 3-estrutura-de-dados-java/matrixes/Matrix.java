package matrixes;

public class Matrix {
    public static void main(String[] args) {
        int lim = 4;
        int matrix[][] = {{1,2,3,4},{5,6,7,8}};
        for(int i=0; i<lim; i++) {
            for(int j=0; j<lim ; j++) {
                if(j==(lim-1)) System.out.print(matrix[i][j]);
                else System.out.print(matrix[i][j]+"|");
            }
            System.out.print("\n");
        }
    }
}
