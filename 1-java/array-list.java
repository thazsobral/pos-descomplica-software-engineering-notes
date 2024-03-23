import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("JavaScript");
        linguagens.add("CSharp");
        linguagens.add("Python");

        System.out.println("ArrayList: "+linguagens); //ArrayList: [Java, JavaScript, CSharp, Python]
        String[] array = new String[linguagens.size()];
        Iterator<String> it = linguagens.iterator();

        for (int i=0; i<array.length; i++) {
            array[i] = it.next(); 
        }

        for (String elemento : array) {
            System.out.print(elemento+", "); //Java, JavaScript, CSharp, Python,
        }

        /*
        for (int i=0; i<linguagens.size(); i++) {
            array[i] = linguagens.get(i);
        }
        for (String elemento : array) {
            System.out.print(elemento + ", "); //Java, JavaScript, CSharp, Python,
        }
        */
    }
}
