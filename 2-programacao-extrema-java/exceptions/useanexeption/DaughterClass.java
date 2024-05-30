package exceptions.useanexeption;

public class DaughterClass {
    GranddaughterClass granddaughterClass;

    public void excute() throws Exception {
        granddaughterClass = new GranddaughterClass();
        granddaughterClass.excute();
    }
}
