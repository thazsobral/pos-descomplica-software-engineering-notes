package treeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(30);
        numeros.add(6);
        numeros.add(9);
        System.out.println("TreeSet: "+numeros);

        numeros.add(15);
        System.out.println("TreeSet: "+numeros);

        numeros.remove(9);
        System.out.println("TreeSet: "+numeros);
    }
}
