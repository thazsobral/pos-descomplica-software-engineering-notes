package collections;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList<>();
        listName.add("joao");
        listName.add("maria");
        listName.add("giovanna");
        listName.add("arnaldo");

        for(String name : listName) {
            System.out.println(name);
        }
        System.out.println("\n");

        listName.set(0, "pedro");

        for(String name : listName) {
            System.out.println(name);
        }
        System.out.println("\n");

        listName.remove(2);
        listName.add("null");

        for(String name : listName) {
            System.out.println(name);
        }
    }   
}
