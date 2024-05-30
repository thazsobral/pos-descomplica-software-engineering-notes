import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseRead {
    public static void main(String[] args) {
        String pathFile = "/home/thazsobral/projects/pos-descomplica-software-engineering-notes/2-programacao-extrema-java/file/myfile.txt";
        try {
            FileReader file = new FileReader(pathFile);
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
            file.close();
        } catch (IOException e) {
            System.out.println("Erro na entrada dos dados: "+e);
        } catch (Exception e) {
            System.out.println("Erro ao ler os arquivos: "+e);
        }
    }
}
