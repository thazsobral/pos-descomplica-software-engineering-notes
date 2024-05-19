package repetitionstructure;

public class LoopEnhancedFor {
    public static void main(String[] args) {
        int[] meuArray = new int[10];
        int i = 0;
        // Loop for tradicional a ser preenchido
        for (int k = 100; k > 0; k = k - 10, i++)
        {
            meuArray[i] = k;
        }
        // Aprimorado para os melhores elementos de loop da matriz 
        for(int loopVal: meuArray) { // loop enhaced for
            System.out.println(loopVal);
        }
    }
}
