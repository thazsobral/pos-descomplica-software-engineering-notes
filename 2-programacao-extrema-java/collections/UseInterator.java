package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UseInterator {
    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList<>();
        listName.add("joao");
        listName.add("maria");
        listName.add("giovanna");
        listName.add("arnaldo");

        Iterator<String> iterator = listName.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }   
}
