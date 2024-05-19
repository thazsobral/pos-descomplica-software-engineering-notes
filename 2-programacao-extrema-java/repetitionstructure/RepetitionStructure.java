package repetitionstructure;

public class RepetitionStructure {
    public static void main(String[] args) {
        int t = 10;
        int i = 0;
        // while
        while(i < t) {
            i++;
            System.out.println(i);
        }
        // do while
        do {
            System.out.println(i);
        } while(i < t);
        // for
        for(i=0;i < t; i++) {
            System.out.println(i);
        }
    }
}
