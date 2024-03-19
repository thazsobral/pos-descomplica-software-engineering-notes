class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        int matriz[][] = new int[a][b];

        for(int i=0; i < a; i++) {
            for(int j=0; j < b; j++) {
                matriz[i][j] = i+j;
            }
        }

        for(int i=0; i < a; i++) {
            for(int j=0; j < b; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }
}

