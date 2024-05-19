package repetitionstructure;

import java.util.Scanner;

public class InitWithNoneLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 1;
        for(; op != 0; op++) {
            System.out.println(op);
            System.out.println("Digite um valor:");
            op = input.nextInt();
        }
    }
}