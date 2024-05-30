import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UseWrite {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String id, name;
        double test, exam;
        int falls;

        FileWriter file = new FileWriter("/home/thazsobral/projects/pos-descomplica-software-engineering-notes/2-programacao-extrema-java/file/myfilewrite.txt");
        PrintWriter printer = new PrintWriter(file);

        System.out.println("Digite a matricula: ");
        id = scanner.next();
        System.out.println("Digite o nome: ");
        name = scanner.next();
        System.out.println("Digite a nota de teste: ");
        test = scanner.nextDouble();
        System.out.println("Digite a nota da prova: ");
        exam = scanner.nextDouble();
        System.out.println("Digite a quantidade de faltas: ");
        falls = scanner.nextInt();

        printer.println("id: "+id);
        printer.println("nome: "+name);
        printer.println("teste: "+test);
        printer.println("prova: "+exam);
        printer.println("faltas: "+falls);

        file.close();
        scanner.close();

        System.out.println("Arquivo gravado com sucesso");
    }
}
