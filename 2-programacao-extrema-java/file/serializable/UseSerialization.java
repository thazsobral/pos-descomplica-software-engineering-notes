package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UseSerialization implements Serializable {
    public static void main(String[] args) {
        Student student1 = new Student("joaquim", 3, 7);
        Student student2 = new Student("vitor", 2, 8);
        Student student3 = new Student("flavia", 5, 10);

        File pathFile = new File("/home/thazsobral/projects/pos-descomplica-software-engineering-notes/2-programacao-extrema-java/file/serializable/myfileserializable.txt");

        try {
            FileOutputStream fileOut = new FileOutputStream(pathFile);
            ObjectOutputStream objFileOut = new ObjectOutputStream(fileOut);

            objFileOut.writeObject(student1);
            objFileOut.writeObject(student2);
            objFileOut.writeObject(student3);

            objFileOut.close();
            fileOut.close();

            FileInputStream fileIn = new FileInputStream(pathFile);
            ObjectInputStream objFileIn = new ObjectInputStream(fileIn);

            Student studentR1 = (Student) objFileIn.readObject();
            Student studentR2 = (Student) objFileIn.readObject();
            Student studentR3 = (Student) objFileIn.readObject();

            objFileIn.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
