package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println("ArrayList: "+numeros);

        numeros.add(1, 5);
        System.out.println("ArrayList: "+numeros);
        // aplicando iterator
        Iterator<Integer> it = numeros.iterator();

        /*
        int numero = it.next();
        System.out.println("Elemento: "+numero); //1
        numero = it.next();
        System.out.println("Elemento: "+numero); //2
        */

        while(it.hasNext()) {
            it.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}
