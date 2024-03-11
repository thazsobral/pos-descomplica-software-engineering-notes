class Main {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        boolean resultado;

        resultado = n1 > n2; // maior
        System.out.println(resultado);

        resultado = n1 < n2; // menor
        System.out.println(resultado);

        resultado = n1 == n2; // igual
        System.out.println(resultado);

        resultado = n1 != n2; // diferente
        System.out.println(resultado);

        resultado = n1 >= n2; //maior ou igual
        System.out.println(resultado);

        resultado = n1 <= n2; //menor ou igual
        System.out.println(resultado);

        System.out.println(true && false); // AND
        System.out.println(true || false); // OR
        System.out.println(!true);         // NOT
        System.out.println(true ^ true);   // XOR
    }
}
