class Main {
    public static void main(String[] args) {
        // int x=4, y=8, r=0; // manter r igual zero para trabalhar com multiplicação
        int x=4, y=8, r=1; // manter r igual um para trabalhar com exponenciação
        
        for(int i=0; i<x; i++) {
            // r = r + y; // para trabalhar com multiplicação
            r = r * y; // para trabalhar com exponenciação
        }
        
        System.out.println(r);
    }

}
