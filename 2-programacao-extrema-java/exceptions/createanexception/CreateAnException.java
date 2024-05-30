package exceptions.createanexception;

public class CreateAnException {
    public static void main(String[] args) {
        try {
            throw new MyException("minha exceção.");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
