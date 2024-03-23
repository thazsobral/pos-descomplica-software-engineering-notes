package sobrecarga;

class Desenho {
    public void mostrar() {
        for(int i=0; i<10; i++) System.out.print("*");
        System.out.print("\n");  
    }

    public void mostrar(char simb) {
        for(int i=0; i<10; i++) System.out.print(simb);   
        System.out.print("\n");
    }

    public void mostrar(char simb, int n) {
        for(int i=0; i<n; i++) System.out.print(simb);   
        System.out.print("\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Desenho d = new Desenho();
        d.mostrar();
        d.mostrar('#');
        d.mostrar('$', 3);
    }
}
