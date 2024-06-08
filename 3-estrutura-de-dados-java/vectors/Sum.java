package vectors;

import javax.swing.JOptionPane;

public class Sum {
    public static void main(String[] args) {
        int vetSum [], i, sum = 0;
        vetSum = new int[10];
        for(i = 0; i < vetSum.length; i++) {
            vetSum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma valor inteiro"));
            sum += vetSum[i];
        }
        System.out.println("A soma é: "+sum);
        System.exit(0);
    }
}
