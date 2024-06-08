package matrixes;

public class Multi {
    public static void main(String[] args) {
        int test[][][] = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int lim = 2;
        for(int i=0; i < lim; i++) {
            for(int j=0; j < lim; j++) {
                for(int k=0; k < lim; k++) {
                    if(k==lim-1) System.out.print(test[i][j][k]);
                    else System.out.print(test[i][j][k]+"|");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
