package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Poligono p = new Poligono();
        Quadrado q = new Quadrado();
        Circulo c = new Circulo();

        p.desenhar();
        q.desenhar();
        c.desenhar();
    }
}
