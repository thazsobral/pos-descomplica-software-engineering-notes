package heranca.animal;

public class Main {
    public static void main(String[] args) {
        Cao c = new Cao();
        c.setNome("Bidu");
        

        Gato g = new Gato();
        g.setNome("Lala");

        c.mostrar();
        g.mostrar();
    }
}
