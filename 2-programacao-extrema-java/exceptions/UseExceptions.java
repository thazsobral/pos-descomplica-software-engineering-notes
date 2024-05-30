package exceptions;

public class UseExceptions {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error Aritmethic: "+e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println("message: " + e.getMessage());
            System.out.println("localize message: " + e.getLocalizedMessage());
            System.out.println("cause: " + e.getCause());
            System.out.println("class: " + e.getClass().getName());
            System.out.println("trace: " + e.getStackTrace().getClass().getName());
            System.out.println("suppressed: " + e.getSuppressed().getClass().getName());
        } finally {
            System.out.println("The End!");
        }
    }
}
