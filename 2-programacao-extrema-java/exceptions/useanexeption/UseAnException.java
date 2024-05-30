package exceptions.useanexeption;

public class UseAnException {
    public static void main(String[] args) {
        try {
            DaughterClass daughterClass = new DaughterClass();
            daughterClass.excute();
        } catch (Exception e) {
            System.out.println("message: "+e.getMessage());
        }
    }
}