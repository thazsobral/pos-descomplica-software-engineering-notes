class Main {
    public static void main(String[] args) {
        int[] lista = {13,41,5,86,72,9,82,36,27,8};
        int pares = 0;
        
        int maiores = 0;
        for(int i=0; i<10; i++) {
            if(lista[i] % 2 == 0)
                    pares = pares + 1;
            if(lista[i] > 28)
                    maiores = maiores + 1;
        }
        System.out.println("Pares são: " + pares);
        System.out.println("Maiores que 28 são: " + maiores);
    }
}