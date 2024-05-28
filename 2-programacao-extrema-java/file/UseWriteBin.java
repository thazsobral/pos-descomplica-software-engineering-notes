
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class UseWriteBin {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String id, name;
        double test, exam;
        int falls;

        FileOutputStream file = new FileOutputStream("/home/thazsobral/projects/pos-descomplica-software-engineering-notes/2-programacao-extrema-java/file/myfilewritebin.dat");
        DataOutputStream printer = new DataOutputStream(file);

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

        printer.writeUTF(id);
        printer.writeUTF(name);
        printer.writeDouble(test);
        printer.writeDouble(exam);
        printer.writeInt(falls);

        file.close();
        scanner.close();

        System.out.println("Arquivo gravado com sucesso");
    }
}
