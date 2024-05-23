package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class UseComparator {
    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList<>();
        listName.add("joao");
        listName.add("maria");
        listName.add("giovanna");
        listName.add("arnaldo");

        System.out.println(listName);

        for(int i=0; i<listName.size(); i++) {
            System.out.println(listName.get(i));
        }
        
        Comparator<String> comparator = Collections.reverseOrder();
        Collections.sort(listName, comparator);

        System.out.println(listName);

        for(String name : listName) {
           System.out.println(name); 
        }
    }   
}
