import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> estados = new ArrayList<>();

        estados.add("São Paulo");
        estados.add("Rio de Janeiro");
        estados.add("Pernambuco");
        estados.add("Ceára");
        estados.add("Espírito Santo");
        System.out.println(estados);

        estados.remove("São Paulo");
        System.out.println(estados);
        
        System.out.println(estados.contains("Amazonas"));

        estados.add(estados.indexOf("Ceára"), "Amazonas");
        System.out.println(estados);

        estados.clear();
        System.out.println(estados);

    }    
}
