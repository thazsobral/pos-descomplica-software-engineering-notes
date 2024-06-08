package sort;

public class BubbleSort {
    public static int[] sort(int numbers[]) {
        final int n = numbers.length;
        int aux;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(numbers[j] > numbers[j+1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        int array[] = {2,1,56,23,33,1001,103};
        System.out.println("Array original:");
        for (int i : array) {
            System.out.println(i);
        }
        int arraySorted[];
        System.out.println("ordenando ...");
        arraySorted = sort(array);
        System.out.println("Array ordenado");
        for (int i : arraySorted) {
            System.out.println(i);
        }
    }
}
