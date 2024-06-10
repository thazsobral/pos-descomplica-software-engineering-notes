package recursion;

public class Factorial {
    public static int factorialWithTail(int value) { //exemplo de recursão com cauda
        if(value == 0) { // regra 1: quando parar a recursão? (value == 0)
            return 1;
        } else {
            return value * factorialWithTail(value-1); //regra 2: o que fazer com a recursao? (value *) e 3: como minuir a jornada recursiva? (factorial(value-1))
        }
    }

    public static void taillessFactorial(int value, int factor) { //exemplo de recursão sem cauda
        if(value > 1) { // 
            taillessFactorial(value - 1, factor * value); //
        } else {
            System.out.println("O fatorial é "+factor);
        }
    }

    public static void main(String[] args) {
        int result, value = 5;
        //result = factorialWithTail(value);
        //System.out.println(result);
        taillessFactorial(value, 1);
    }
}