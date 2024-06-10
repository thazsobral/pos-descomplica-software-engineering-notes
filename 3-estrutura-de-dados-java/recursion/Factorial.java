package recursion;

public class Factorial {
    public static int factorial(int value) {
        if(value == 0) { // regra 1: quando parar a recursão? (value == 0)
            return 1;
        } else {
            return value * factorial(value-1); //regra 2: o que fazer com a recursao? (value *) e 3: como minuir a jornada recursiva? (factorial(value-1))
        }
    }

    public static void main(String[] args) {
        int result, value = 5;
        result = factorial(value);
        System.out.println(result);
    }
}