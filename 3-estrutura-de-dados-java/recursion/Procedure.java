package recursion;

import javax.swing.*;

public class Procedure {
    public static void procedureFactorial(int value, int count, int result) { // recursividade sem cauda
        if(count == 0 || count == 1) { // regra 1
            //System.out.println("O fatorial de "+value+" é "+result);
            JOptionPane.showMessageDialog(null, "O fatorial de "+value+" é "+result);
        } else {
            procedureFactorial(value, count - 1, result * count); // regra 2 e 3
        }
    }

    public static void main(String[] args) {
        int value = 5;
        procedureFactorial(value, value, 1);
    }
}
