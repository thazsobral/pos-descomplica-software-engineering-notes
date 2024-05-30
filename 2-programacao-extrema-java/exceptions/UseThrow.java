package exceptions;

public class UseThrow {
    public static void main(String[] args) {
        try {          
            int i = 0;
            if(i==0) {
                throw new Exception("Meu erro");
            }
            System.out.println("Paseei!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
