package sobreescrita;

class Linguagem {
    public void mostrarInformacao() {
        System.out.println("Língua Portuguesa.");
    }
}

class Java extends Linguagem{
    public void mostrarInformacao() {
        System.out.println("Língua Java.");
    }
}

public class Main {
    public static void main(String[] args) {
        Java j = new Java();
        j.mostrarInformacao();
    }
}
