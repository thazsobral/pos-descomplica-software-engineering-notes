package vectors;

public class Vector {
    public static void main(String[] args) {
        int numbers[] = new int[3];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 2;

        for (int i : numbers) {
            System.out.println(i);
        }

        int othersNumbers[] = {5,6,7,8,9};
        for (int i = 0; i < othersNumbers.length; i++) {
            System.out.println(othersNumbers[i]);
        }
    }
}