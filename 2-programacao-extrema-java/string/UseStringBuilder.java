package string;

public class UseStringBuilder {
    public static void main(String[] args) {
        String name = "Thalles";
        String lastname = "Sobral";
        String name1 = name + lastname;
        String name2;
        
        StringBuilder buffer = new StringBuilder();
        buffer.append(name);
        buffer.append(lastname);

        System.out.println(name1);
        System.out.println(buffer); // this clear next time
        name2 = buffer.toString();

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
