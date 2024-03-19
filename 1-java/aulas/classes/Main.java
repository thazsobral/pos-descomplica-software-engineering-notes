package classes;

public class Main {
    public static void main(String[] args) {
        Cao cao = new Cao();
        cao.Anda();

        Cao novoCao = new Cao("Lulu", 12, "azul", 10.4);
        novoCao.Anda();

        if(cao.idadeMaiorQue(10)) {
            System.out.println("Ele é idoso");
        } else {
            System.out.println("Ele é novinho");
        }
    }
}
