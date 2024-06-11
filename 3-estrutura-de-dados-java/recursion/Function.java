package recursion;

public class Function {
    public static int functionFactoril(int value) {
        int factorial;
        if(value == 0) {
            return 1;
        } else {
            factorial = value * functionFactoril(value - 1);
            return factorial;
        }
    }

    public static void main(String[] args) {
        int result, value = 5;
        result = functionFactoril(value);
        System.out.println(result);
    }
}
