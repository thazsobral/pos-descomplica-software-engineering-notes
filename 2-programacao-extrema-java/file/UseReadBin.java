
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class UseReadBin {
    public static void main(String[] args) {
        String pathFile = "/home/thazsobral/projects/pos-descomplica-software-engineering-notes/2-programacao-extrema-java/file/myfilewritebin.dat";
        try {
            FileInputStream file = new FileInputStream(pathFile);
            DataInputStream reader = new DataInputStream(file);
            String id = reader.readUTF();
            String name = reader.readUTF();
            double test = reader.readDouble();
            double exam = reader.readDouble();
            int falls = reader.readInt();

            System.out.println("id: "+id);
            System.out.println("nome: "+name);
            System.out.println("teste: "+test);
            System.out.println("exame: "+exam);
            System.out.println("faltas: "+falls);

            reader.close();
            file.close();
        } catch (IOException e) {
            System.out.println("Erro na entrada dos dados: "+e);
        } catch (Exception e) {
            System.out.println("Erro ao ler os arquivos: "+e);
        }
    }
}
