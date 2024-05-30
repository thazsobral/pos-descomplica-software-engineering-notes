import java.io.File;
import java.util.Scanner;

public class UseFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo (com seu caminho): ");
        String pathFile = scanner.next();

        File objFile  = new File(pathFile);
        if(objFile.exists()) {
            if(objFile.isFile()) {
                System.out.println("nome: "+objFile.getName());
                System.out.println("tamanho: "+objFile.length());
            }
        } else {
            System.out.println("Arquivo não existe");
        }
        scanner.close();
    }
}